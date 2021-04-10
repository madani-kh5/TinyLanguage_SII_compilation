
import java.util.LinkedList;
import java.util.Vector;

public class SemanticQuad extends TinyLanguage_SIIBaseListener {
    private LinkedList<String> pile = new LinkedList<>();
    private TabQuad quads = new TabQuad();
    private int cptTemps = 0;
    public static Vector<Integer> etiq = new Vector<>();

    public TabQuad getQuads() {
        return quads;

    }



    @Override public void exitAffectation(TinyLanguage_SIIParser.AffectationContext ctx) {
        String DP = pile.removeLast();
        quads.addQuad("=",DP,"",ctx.ID().getText());
    }



    @Override public void exitExp(TinyLanguage_SIIParser.ExpContext ctx) {
        if(ctx.exp() != null)
        {
            String DP = pile.removeLast();
            String AVDP = pile.removeLast();
            String temp = "Temp"+(++cptTemps);
            quads.addQuad(ctx.operpm().getText(),AVDP,DP,temp);
            pile.add(temp);
        }
    }




    @Override public void  exitExp2(TinyLanguage_SIIParser.Exp2Context ctx)
    {
        if(ctx.exp2() != null)
        {
            String SS = pile.removeLast(),SSS = pile.removeLast();
            String temp = "Temp"+(++cptTemps);
            quads.addQuad(ctx.opermd().getText(),SSS,SS,temp);
            pile.add(temp);
        }

    }



    @Override public void exitExp3(TinyLanguage_SIIParser.Exp3Context ctx)
    {
        if(ctx.exp() == null) {
            pile.add(ctx.getText());

        }

    }



    int saveCondition ;
    @Override public void exitCondition(TinyLanguage_SIIParser.ConditionContext ctx) {

        String DP = pile.removeLast();
        String AVDP = pile.removeLast();
        String ctxOp= ctx.op().getText();
        String op;
        if (ctx.op().SUP() != null ) {op = "BG" ;}
        else if (ctx.op().INF() != null) {op = "BL" ;}
        else if (ctx.op().SUPE() != null) { op = "BGE";   }
        else if (ctx.op().INFE() != null) { op = "BLE"; }
        else if (ctx.op().EQ() != null) {  op = "BE";  }
        else if (ctx.op().DIF() != null) {  op = "BNE"; }
        else { op = "";}

        saveCondition = quads.addQuad(op,AVDP,DP,"");
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
