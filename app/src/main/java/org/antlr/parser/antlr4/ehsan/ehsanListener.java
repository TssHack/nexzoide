// Generated from /storage/emulated/0/AndroidIDEProjects/nexzo-web-ide2/grammars-v4/ehsan.g4 by ANTLR 4.13.1
package org.antlr.parser.antlr4.ehsan;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ehsanParser}.
 */
public interface ehsanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code installRule}
	 * labeled alternative in {@link ehsanParser#install}.
	 * @param ctx the parse tree
	 */
	void enterInstallRule(ehsanParser.InstallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code installRule}
	 * labeled alternative in {@link ehsanParser#install}.
	 * @param ctx the parse tree
	 */
	void exitInstallRule(ehsanParser.InstallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsanParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(ehsanParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsanParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(ehsanParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ehsanParser#forsteament}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ehsanParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ehsanParser#forsteament}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ehsanParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementWithBlock}
	 * labeled alternative in {@link ehsanParser#ifsteament}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementWithBlock(ehsanParser.IfStatementWithBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementWithBlock}
	 * labeled alternative in {@link ehsanParser#ifsteament}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementWithBlock(ehsanParser.IfStatementWithBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementWithoutBlock}
	 * labeled alternative in {@link ehsanParser#ifsteament}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementWithoutBlock(ehsanParser.IfStatementWithoutBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementWithoutBlock}
	 * labeled alternative in {@link ehsanParser#ifsteament}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementWithoutBlock(ehsanParser.IfStatementWithoutBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pwdStatement}
	 * labeled alternative in {@link ehsanParser#pwdstemant}.
	 * @param ctx the parse tree
	 */
	void enterPwdStatement(ehsanParser.PwdStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pwdStatement}
	 * labeled alternative in {@link ehsanParser#pwdstemant}.
	 * @param ctx the parse tree
	 */
	void exitPwdStatement(ehsanParser.PwdStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coordinatedStatement}
	 * labeled alternative in {@link ehsanParser#coordinatedstemant}.
	 * @param ctx the parse tree
	 */
	void enterCoordinatedStatement(ehsanParser.CoordinatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coordinatedStatement}
	 * labeled alternative in {@link ehsanParser#coordinatedstemant}.
	 * @param ctx the parse tree
	 */
	void exitCoordinatedStatement(ehsanParser.CoordinatedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setStatement}
	 * labeled alternative in {@link ehsanParser#setstement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(ehsanParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setStatement}
	 * labeled alternative in {@link ehsanParser#setstement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(ehsanParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getStatementWithoutCall}
	 * labeled alternative in {@link ehsanParser#getstement}.
	 * @param ctx the parse tree
	 */
	void enterGetStatementWithoutCall(ehsanParser.GetStatementWithoutCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getStatementWithoutCall}
	 * labeled alternative in {@link ehsanParser#getstement}.
	 * @param ctx the parse tree
	 */
	void exitGetStatementWithoutCall(ehsanParser.GetStatementWithoutCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getStatementWithCall}
	 * labeled alternative in {@link ehsanParser#getstement}.
	 * @param ctx the parse tree
	 */
	void enterGetStatementWithCall(ehsanParser.GetStatementWithCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getStatementWithCall}
	 * labeled alternative in {@link ehsanParser#getstement}.
	 * @param ctx the parse tree
	 */
	void exitGetStatementWithCall(ehsanParser.GetStatementWithCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classStatement}
	 * labeled alternative in {@link ehsanParser#classorinterfacePaser}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(ehsanParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classStatement}
	 * labeled alternative in {@link ehsanParser#classorinterfacePaser}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(ehsanParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceStatement}
	 * labeled alternative in {@link ehsanParser#classorinterfacePaser}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatement(ehsanParser.InterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceStatement}
	 * labeled alternative in {@link ehsanParser#classorinterfacePaser}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatement(ehsanParser.InterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatementWithBlock}
	 * labeled alternative in {@link ehsanParser#trystemant}.
	 * @param ctx the parse tree
	 */
	void enterTryStatementWithBlock(ehsanParser.TryStatementWithBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatementWithBlock}
	 * labeled alternative in {@link ehsanParser#trystemant}.
	 * @param ctx the parse tree
	 */
	void exitTryStatementWithBlock(ehsanParser.TryStatementWithBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatementWithoutBlock}
	 * labeled alternative in {@link ehsanParser#trystemant}.
	 * @param ctx the parse tree
	 */
	void enterTryStatementWithoutBlock(ehsanParser.TryStatementWithoutBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatementWithoutBlock}
	 * labeled alternative in {@link ehsanParser#trystemant}.
	 * @param ctx the parse tree
	 */
	void exitTryStatementWithoutBlock(ehsanParser.TryStatementWithoutBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerStatement}
	 * labeled alternative in {@link ehsanParser#hanlderstemant}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(ehsanParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerStatement}
	 * labeled alternative in {@link ehsanParser#hanlderstemant}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(ehsanParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aslomod}
	 * labeled alternative in {@link ehsanParser#asloruner}.
	 * @param ctx the parse tree
	 */
	void enterAslomod(ehsanParser.AslomodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aslomod}
	 * labeled alternative in {@link ehsanParser#asloruner}.
	 * @param ctx the parse tree
	 */
	void exitAslomod(ehsanParser.AslomodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code runmod}
	 * labeled alternative in {@link ehsanParser#runruner}.
	 * @param ctx the parse tree
	 */
	void enterRunmod(ehsanParser.RunmodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code runmod}
	 * labeled alternative in {@link ehsanParser#runruner}.
	 * @param ctx the parse tree
	 */
	void exitRunmod(ehsanParser.RunmodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applymod}
	 * labeled alternative in {@link ehsanParser#applyruner}.
	 * @param ctx the parse tree
	 */
	void enterApplymod(ehsanParser.ApplymodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applymod}
	 * labeled alternative in {@link ehsanParser#applyruner}.
	 * @param ctx the parse tree
	 */
	void exitApplymod(ehsanParser.ApplymodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashCoommentModel}
	 * labeled alternative in {@link ehsanParser#hashcomment}.
	 * @param ctx the parse tree
	 */
	void enterHashCoommentModel(ehsanParser.HashCoommentModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashCoommentModel}
	 * labeled alternative in {@link ehsanParser#hashcomment}.
	 * @param ctx the parse tree
	 */
	void exitHashCoommentModel(ehsanParser.HashCoommentModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsanParser#opentagid}.
	 * @param ctx the parse tree
	 */
	void enterOpentagid(ehsanParser.OpentagidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsanParser#opentagid}.
	 * @param ctx the parse tree
	 */
	void exitOpentagid(ehsanParser.OpentagidContext ctx);
}