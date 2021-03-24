// Generated from C:/Users/User/IdeaProjects/Tiny_language/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyLanguage_SIIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyLanguage_SIIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(TinyLanguage_SIIParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TinyLanguage_SIIParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TinyLanguage_SIIParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TinyLanguage_SIIParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(TinyLanguage_SIIParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TinyLanguage_SIIParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TinyLanguage_SIIParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(TinyLanguage_SIIParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TinyLanguage_SIIParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(TinyLanguage_SIIParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp3(TinyLanguage_SIIParser.Exp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TinyLanguage_SIIParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#operpm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperpm(TinyLanguage_SIIParser.OperpmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#opermd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermd(TinyLanguage_SIIParser.OpermdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#instif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstif(TinyLanguage_SIIParser.InstifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TinyLanguage_SIIParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(TinyLanguage_SIIParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#instwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstwhile(TinyLanguage_SIIParser.InstwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(TinyLanguage_SIIParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyLanguage_SIIParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TinyLanguage_SIIParser.PrintContext ctx);
}