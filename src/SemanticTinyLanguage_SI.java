import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.reflect.Field;

class SemanticTinyLanguage_SI extends  TinyLanguage_SIIBaseListener {

    private static final char intCompil = 'i';
    private static final char floatCompil = 'f';
    private static final char StringCompil = 's';
    private static final boolean Declared = true ;
    private static final boolean Undeclared = false ;

    private SymbolTable table = new SymbolTable();
    private LinkedList<String> TableErrors = new LinkedList<>();
    private HashMap<ParserRuleContext, Character> types = new HashMap<>();

//    public SemanticTinyLanguage_SI(LinkedList<String> errors) {
//        this.TableErrors = errors;
//    }

    public SymbolTable getTable() {
        return table;
    }

    @Override public void exitStart_rule(TinyLanguage_SIIParser.Start_ruleContext ctx){

         //on verifie si il n'y a pas d'erreurs
         if(TableErrors.size() == 0){
             System.out.println("programme compiler sans erreurs");
         }
         //sinon on affiche les erreurs de la TableErrors
         else{
             afficherErreurs();
         }
    }

    @Override public void exitAffectation(TinyLanguage_SIIParser.AffectationContext ctx) {
//        char typeExp = getCtxTypes(ctx.exp());
//        char typeID = table.getElement(ctx.ID().getText()).type;
        if(!table.ExistElement(ctx.ID().getText()))
        {    table.addElement(new SymbolTable.Element(ctx.ID().getText(),Undeclared,'e',1));
            TableErrors.add(Position(ctx.ID())+"variable " + ctx.ID().getText() + " est non declaree");
        }
        if(!CompatibleTypes( getCtxTypes(ctx.exp()) , table.getElement(ctx.ID().getText()).type ))
            TableErrors.add ( Position(ctx.ID()) + "incompatible types in affectation " + ctx.getText() + " : " + table.getElement(ctx.ID().getText()).type + " avec " + getCtxTypes(ctx.exp()));


        clearTypes();
    }


    @Override public void exitExp(TinyLanguage_SIIParser.ExpContext ctx){
       /* if(!typesSame(table.getElement(ctx.exp().getText()).type,table.getElement(ctx.exp2().getText()).type)){
            TableErrors.add("la variable " + ctx.exp().getText() + " et la variable "+ ctx.exp2().getText() +
                    " ne sont pas compatible pour effectuer l'operation");
        } */
//        char ExpType = getCtxTypes(ctx.exp());
//        char Exp2Type = getCtxTypes(ctx.exp2());

        if(ctx.exp() == null)
            addCtxTypes(ctx, getCtxTypes(ctx.exp2()) );
        else
        {   if(CompatibleTypes( getCtxTypes(ctx.exp()) , getCtxTypes(ctx.exp2()) ))
                {
                    addCtxTypes(ctx, getCtxTypes(ctx.exp()) );
                }
             else {
                 addCtxTypes(ctx,'e'); // e : error
                }
        }
        }


    @Override public void exitExp2(TinyLanguage_SIIParser.Exp2Context ctx){
       /* if(!typesSame(table.getElement(ctx.exp2().getText()).type,table.getElement(ctx.exp3().getText()).type)){
            TableErrors.add("la variable " + ctx.exp2().getText() + " et la variable "+ ctx.exp3().getText() +" ne sont pas compatible pour effectuer l'operation");
        }*/

//        char Exp3Type = getCtxTypes(ctx.exp3());
//        char Exp2Type = getCtxTypes(ctx.exp2());

        if(ctx.exp2() == null)
            addCtxTypes(ctx,getCtxTypes(ctx.exp3()));
        else
        {
            if(CompatibleTypes( getCtxTypes(ctx.exp2()) , getCtxTypes(ctx.exp3()) )){
                addCtxTypes(ctx, getCtxTypes(ctx.exp2()) );
            }
            else {
                addCtxTypes(ctx,'e');// e : error
            }
        }



    }
    @Override public void exitExp3(TinyLanguage_SIIParser.Exp3Context ctx){
        if (ctx.ID() != null) {
            if(!table.ExistElement(ctx.ID().getText()))
            {
                TableErrors.add(Position(ctx.ID())+"variable " + ctx.ID().getText() + " est non declaree");
            }else {
            addCtxTypes(ctx,table.getElement(ctx.ID().getText()).type);
            }
        }
        else if(ctx.exp() != null){
            addCtxTypes(ctx,getCtxTypes(ctx.exp()));
        }
        else {
            addCtxTypes(ctx,getCtxTypes(ctx.value()));
        }
    }


    @Override public void exitDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx) {
        char type = 0;
        String vtype = ctx.type().getText();
        if (vtype.equals( "intCompil")) { type = intCompil; }
        else if (vtype.equals("floatCompil") ) { type = floatCompil; }
        else if (vtype.equals("StringCompil") ) { type= StringCompil;}

           TinyLanguage_SIIParser.VariablesContext vars = ctx.variables();

        for( ;; vars = vars.variables())
        {
           String VariableName = vars.getChild(0).getText();

            if (table.ExistElement(VariableName)) { TableErrors.add("Double declaration de :"+ VariableName);}
            else { table.addElement( new SymbolTable.Element(VariableName,Declared,type,1));}

            if(vars.variables() == null)
                return;
        }
    }

    @Override public void exitCondition(TinyLanguage_SIIParser.ConditionContext ctx) {
        clearTypes();
    }
    @Override public void exitValue(TinyLanguage_SIIParser.ValueContext ctx) {
        if (ctx.INTEGERVAL() !=null ) {addCtxTypes(ctx,intCompil);}
        else if (ctx.FLOATVAL() !=null ) {addCtxTypes(ctx,floatCompil);}
        else if (ctx.STRINGVAL() !=null ) {addCtxTypes(ctx,StringCompil);}
        else {addCtxTypes(ctx,'e');}
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

    private void addCtxTypes (ParserRuleContext ctx,char t){
         types.put(ctx,t);
    }

    private char getCtxTypes (ParserRuleContext ctx){
        return types.get(ctx);
    }

    private void clearTypes()
    {
        types.clear();
    }

    private static boolean CompatibleTypes(char t1,char t2)
    {
        return t1 == t2;
    }


    public static String Position(TerminalNode terminalNode) {
        return "line " + terminalNode.getSymbol().getLine() + ":" + terminalNode.getSymbol().getCharPositionInLine() + " ";
    }


}