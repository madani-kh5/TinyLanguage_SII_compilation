import org.antlr.v4.codegen.model.decl.TokenTypeDecl;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.reflect.Field;

import static java.lang.Integer.parseInt;

class SemanticTinyLanguage_SI extends  TinyLanguage_SIIBaseListener {

    private static final char intCompil = 'i';
    private static final char floatCompil = 'f';
    private static final char StringCompil = 's';
    private static final boolean Declared = true ;
    private static final boolean Undeclared = false ;

    private SymbolTable table = new SymbolTable();
    private LinkedList<String> TableErrors = new LinkedList<>();
    private HashMap<ParserRuleContext, Character> types = new HashMap<>();


    public SymbolTable getTable() {
        return table;
    }
    public LinkedList<String>  getTableE() {
        return TableErrors;
    }


    @Override public void exitStart_rule(TinyLanguage_SIIParser.Start_ruleContext ctx){

         //on verifie si il n'y a pas d'erreurs
         if(TableErrors.size() == 0){
             System.out.println("programme compile sans erreurs");
         }
         //sinon on affiche les erreurs de la TableErrors
         else{
             afficherErreurs();
         }
    }

    @Override public void exitAffectation(TinyLanguage_SIIParser.AffectationContext ctx) {
        if (!table.ExistElement(ctx.ID().getText())) {
            table.addElement(new SymbolTable.Element(ctx.ID().getText(), Undeclared, 'e', null));
            TableErrors.add(Position(ctx.ID()) + "variable " + ctx.ID().getText() + " est non declaree");
        }
        if (!CompatibleTypes(getCtxTypes(ctx.exp()), table.getElement(ctx.ID().getText()).type))
            TableErrors.add(Position(ctx.ID()) + "types incompatibles dans l'affectation " + ctx.getText() + " : " + table.getElement(ctx.ID().getText()).type + " avec " + getCtxTypes(ctx.exp()));

        if(table.ExistElement(ctx.ID().getText()) && CompatibleTypes(getCtxTypes(ctx.exp()), table.getElement(ctx.ID().getText()).type) )
        {  if(ctx.exp().exp2().exp3().value() != null && ctx.exp().exp2().opermd() == null && ctx.exp().operpm() == null )
            {table.SetValue(ctx.ID().getText() , ctx.exp().getText());}

            else if (ctx.exp().exp2().exp3().ID() != null && ctx.exp().exp2().opermd() == null && ctx.exp().operpm() == null )
            {
                table.SetValue(ctx.ID().getText() , table.GetValue(ctx.exp().getText()));
            }
            else if (ctx.exp().operpm() != null)
           {    if (ctx.exp().exp2().exp3().ID() == null && ctx.exp().exp2().exp3().value() != null )
                 { if (ctx.exp().exp2().exp3().value().FLOATVAL() != null) {
                     var op1 = 0.0;
                     var op2 = 0.0;
                     op1 = Float.parseFloat(ctx.exp().exp().exp2().exp3().value().getText());
                     op2 = Float.parseFloat(ctx.exp().exp2().exp3().value().getText());
                     if (ctx.exp().operpm().PLUS() != null) {
                         table.SetValue(ctx.ID().getText(), String.valueOf(op1 + op2));
                     }
                  }
                     if (ctx.exp().exp2().exp3().value().INTEGERVAL() != null) {
                         var op1 = 0;
                         var op2 = 0;
                         op1 = parseInt(ctx.exp().exp().exp2().exp3().value().getText());
                         op2 = parseInt(ctx.exp().exp2().exp3().value().getText());
                         if (ctx.exp().operpm().PLUS() != null) {
                             table.SetValue(ctx.ID().getText(), String.valueOf(op1 + op2));
                         }
                     }

                 }
           }
        }


        clearTypes();
    }


    @Override public void exitExp(TinyLanguage_SIIParser.ExpContext ctx){
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

        if(ctx.exp2() == null)
            addCtxTypes(ctx,getCtxTypes(ctx.exp3()));
        else
        {
            if(CompatibleTypes( getCtxTypes(ctx.exp2()) , getCtxTypes(ctx.exp3()) )){
                addCtxTypes(ctx, getCtxTypes(ctx.exp2()) );
                if (ctx.opermd().getText().equals("/") && ctx.exp3().getText().equals("0"))
                {
                    TableErrors.add( Position(ctx.opermd().DIV()) + "Division sur 0");
                }
            }
            else {
                addCtxTypes(ctx,'e');// e : erreur
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
            else { table.addElement( new SymbolTable.Element(VariableName,Declared,type, null));}

            if(vars.variables() == null)
                return;
        }
    }

    @Override public void exitCondition(TinyLanguage_SIIParser.ConditionContext ctx) {
        if (!CompatibleTypes(getCtxTypes(ctx.exp(0)), getCtxTypes(ctx.exp(1))))
        { TableErrors.add( Position( (TerminalNode) ctx.op().getChild(0)) + "types incompatibles dans la condition "); }


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
        return "ligne " + terminalNode.getSymbol().getLine() + ":" + terminalNode.getSymbol().getCharPositionInLine() + " ";
    }


}