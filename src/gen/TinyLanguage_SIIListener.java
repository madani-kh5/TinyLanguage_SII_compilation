// Generated from C:/Users/acer/Desktop/TinyLanguage_SII_compilation/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyLanguage_SIIParser}.
 */
public interface TinyLanguage_SIIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(TinyLanguage_SIIParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(TinyLanguage_SIIParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(TinyLanguage_SIIParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(TinyLanguage_SIIParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(TinyLanguage_SIIParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(TinyLanguage_SIIParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TinyLanguage_SIIParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TinyLanguage_SIIParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TinyLanguage_SIIParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TinyLanguage_SIIParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(TinyLanguage_SIIParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(TinyLanguage_SIIParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(TinyLanguage_SIIParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(TinyLanguage_SIIParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(TinyLanguage_SIIParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(TinyLanguage_SIIParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TinyLanguage_SIIParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TinyLanguage_SIIParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#operpm}.
	 * @param ctx the parse tree
	 */
	void enterOperpm(TinyLanguage_SIIParser.OperpmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#operpm}.
	 * @param ctx the parse tree
	 */
	void exitOperpm(TinyLanguage_SIIParser.OperpmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#opermd}.
	 * @param ctx the parse tree
	 */
	void enterOpermd(TinyLanguage_SIIParser.OpermdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#opermd}.
	 * @param ctx the parse tree
	 */
	void exitOpermd(TinyLanguage_SIIParser.OpermdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#instif}.
	 * @param ctx the parse tree
	 */
	void enterInstif(TinyLanguage_SIIParser.InstifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#instif}.
	 * @param ctx the parse tree
	 */
	void exitInstif(TinyLanguage_SIIParser.InstifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TinyLanguage_SIIParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TinyLanguage_SIIParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(TinyLanguage_SIIParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(TinyLanguage_SIIParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#instwhile}.
	 * @param ctx the parse tree
	 */
	void enterInstwhile(TinyLanguage_SIIParser.InstwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#instwhile}.
	 * @param ctx the parse tree
	 */
	void exitInstwhile(TinyLanguage_SIIParser.InstwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TinyLanguage_SIIParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TinyLanguage_SIIParser.PrintContext ctx);
}