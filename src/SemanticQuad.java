
import java.util.LinkedList;
import java.util.Vector;

public class SemanticQuad extends TinyLanguage_SIIBaseListener {
    private LinkedList<String> stack = new LinkedList<>();
    private TabQuad quads = new TabQuad();
    private int cptTemps = 0;
    public static Vector<Integer> etiq = new Vector<>();

    public TabQuad getQuads() {
        return quads;
    }



    @Override public void exitAffectation(TinyLanguage_SIIParser.AffectationContext ctx) {
        String LastInStack = stack.removeLast();
        quads.addQuad("=",LastInStack,"",ctx.ID().getText());
    }



    @Override public void exitExp(TinyLanguage_SIIParser.ExpContext ctx) {
        if(ctx.exp() != null)
        {
            String SS = stack.removeLast();
            String SSS = stack.removeLast();
            String temp = "Temp"+(++cptTemps);
            quads.addQuad(ctx.operpm().getText(),SSS,SS,temp);
            stack.add(temp);
        }
    }




    @Override public void  exitExp2(TinyLanguage_SIIParser.Exp2Context ctx)
    {
        if(ctx.exp2() != null)
        {
            String SS = stack.removeLast(),SSS = stack.removeLast();
            String temp = "Temp"+(++cptTemps);
            quads.addQuad(ctx.opermd().getText(),SSS,SS,temp);
            stack.add(temp);
        }

    }



    @Override public void exitExp3(TinyLanguage_SIIParser.Exp3Context ctx)
    {
        if(ctx.exp() == null) {
            stack.add(ctx.getText());

        }

    }



    int saveCondition ;
    @Override public void exitCondition(TinyLanguage_SIIParser.ConditionContext ctx) {

        String SS = stack.removeLast();
        String SSS = stack.removeLast();
        String ctxOp= ctx.op().getText();
        String op;
        if (ctxOp.compareTo(">") == 1) {op = "BG" ;}
        else if (ctxOp.compareTo("<") == 1) {op = "BL" ;}
        else if (ctxOp.compareTo(">=") == 1) { op = "BGE";   }
        else if (ctxOp.compareTo("<=") == 1) { op = "BLE"; }
        else if (ctxOp.compareTo("==") == 1) {  op = "BE";  }
        else if (ctxOp.compareTo("!=") == 1) {  op = "BNE"; }
        else { op = "";}



        saveCondition = quads.addQuad(op,SSS,SS,"");
    }




    @Override public void exitInstelse(TinyLanguage_SIIParser.InstelseContext ctx) {
        quads.getQuad(saveCondition).set(3,""+(quads.size()+1));
        etiq.add(quads.size()+1);
        saveCondition = quads.addQuad("BR","","","");

    }

    @Override public void exitInstif(TinyLanguage_SIIParser.InstifContext ctx) {

        quads.getQuad(saveCondition).set(1,""+quads.size());
        etiq.add(quads.size());

    }

}
