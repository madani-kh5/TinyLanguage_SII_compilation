import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.LinkedList;
class SemanticTinyLanguage_SI extends  TinyLanguage_SIIBaseListener {

    private static final char intCompil = 'i';
    private static final char floatCompil = 'f';
    private static final char StringCompil = 's';
    private static final boolean Declared = true ;
    private static final boolean Undeclared = false ;


    private SymbolTable table = new SymbolTable();
    private LinkedList<String> TableErrors = new LinkedList<>();
    private HashMap<ParserRuleContext,String> typee;

    {

    }

    public void exitProgramme(TinyLanguage_SIIParser.Start_ruleContext ctx){
         //on verifie si il n'y a pas d'erreurs
         if(TableErrors.size() == 0){
             System.out.println("programme compiler sans erreurs");


         }
         //sinon on affiche les erreurs de la TableErrors
         else{
             afficherErreurs();
         }
    }
    public void exitId(TinyLanguage_SIIParser.VariablesContext ctx)
    {
        // check if ID has been declared
        if(!table.ExistElement(ctx.ID().getText()))
        {
            TableErrors.add("variable " + ctx.ID().getText() + " has not been declared");

        }
    }

    public void exitexp(TinyLanguage_SIIParser.ExpContext ctx){
        if(!typesSame(table.getElement(ctx.exp().getText()).type,table.getElement(ctx.exp2().getText()).type)){
            TableErrors.add("la variable " + ctx.exp().getText() + " et la variable "+ ctx.exp2().getText() +
                    " ne sont pas compatible pour effectuer l'operation");
        }


    }
    public void exitexp2(TinyLanguage_SIIParser.Exp2Context ctx){
        if(!typesSame(table.getElement(ctx.exp2().getText()).type,table.getElement(ctx.exp3().getText()).type)){
            TableErrors.add("la variable " + ctx.exp2().getText() + " et la variable "+ ctx.exp3().getText() +" ne sont pas compatible pour effectuer l'operation");
        }



    }
    public void exitExp3(TinyLanguage_SIIParser.Exp3Context ctx){

    }

    public void exittype(TinyLanguage_SIIParser.TypeContext ctx){


    }
       public void exitDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx) {
        char type = 0;
        String vtype = ctx.type().getText();
        if (vtype == "intCompil") { type = intCompil; }
        else if (vtype == "floatCompil") { type = floatCompil; }
        else if (vtype == "StringCompil") { type= StringCompil;}

           TinyLanguage_SIIParser.VariablesContext variables = ctx.variables();
        for( ;; variables = variables.variables())
        {
            String VariableName = variables.getChild(0).getText();

            if (table.ExistElement(VariableName)) { TableErrors.add("Double declaration de :"+ VariableName);}
            else { table.addElement( new SymbolTable.Element(VariableName,Declared,type,1));}
        }
    }

    private static boolean typesSame(char c1,char c2)
    {
        if(c1 == c2) return true;
        else {
            return false;
        }
    }

    public void afficherErreurs()
    { int i;
        for(i=0;i<TableErrors.size();i++)
        {
            System.out.println("\t ERREUR "+TableErrors.get(i));
        }
    }


}