import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

class SemanticTinyLanguage_SI extends  TinyLanguage_SIIBaseListener {

    private static final char intCompil = 'i';
    private static final char floatCompil = 'f';
    private static final char StringCompil = 's';
    private static final boolean Declared = true ;
    private static final boolean Undeclared = false ;


    private SymbolTable table = new SymbolTable();
    private LinkedList<String> TableErrors = new LinkedList<>();



    public void exitDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx) {
        char type;
        String Gtype = ctx.type().getText();
         if (Gtype == 'intCompil') { type = intCompil; }
         else if (Gtype == 'floatCompil') { type = floatCompil; }
         else if (Gtype == 'StringCompil') { type= StringCompil;}


         for( TinyLangageSIIParser.VariablesContext variable = ctx.variables() )
         {
             String VariableName = variable.getChild(0).getText();

                if (table.ExistElement(VariableName)) { TableErrors.add('Double declaration de :'+ VariableName);}
                else { table.addElement(new Element(VariableName,Declared,type,1));}
         }
    }




}