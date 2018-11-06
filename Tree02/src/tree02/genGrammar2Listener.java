// Generated from genGrammar2.g4 by ANTLR 4.5.3

        package tree02;
        import java.util.*;
        import java.lang.*;
        import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link genGrammar2Parser}.
 */
public interface genGrammar2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#genGrammar2}.
	 * @param ctx the parse tree
	 */
	void enterGenGrammar2(genGrammar2Parser.GenGrammar2Context ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#genGrammar2}.
	 * @param ctx the parse tree
	 */
	void exitGenGrammar2(genGrammar2Parser.GenGrammar2Context ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(genGrammar2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(genGrammar2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(genGrammar2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(genGrammar2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#newFunc}.
	 * @param ctx the parse tree
	 */
	void enterNewFunc(genGrammar2Parser.NewFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#newFunc}.
	 * @param ctx the parse tree
	 */
	void exitNewFunc(genGrammar2Parser.NewFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(genGrammar2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(genGrammar2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(genGrammar2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(genGrammar2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#varSet}.
	 * @param ctx the parse tree
	 */
	void enterVarSet(genGrammar2Parser.VarSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#varSet}.
	 * @param ctx the parse tree
	 */
	void exitVarSet(genGrammar2Parser.VarSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#varSet2}.
	 * @param ctx the parse tree
	 */
	void enterVarSet2(genGrammar2Parser.VarSet2Context ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#varSet2}.
	 * @param ctx the parse tree
	 */
	void exitVarSet2(genGrammar2Parser.VarSet2Context ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(genGrammar2Parser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(genGrammar2Parser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#compoundIn}.
	 * @param ctx the parse tree
	 */
	void enterCompoundIn(genGrammar2Parser.CompoundInContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#compoundIn}.
	 * @param ctx the parse tree
	 */
	void exitCompoundIn(genGrammar2Parser.CompoundInContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(genGrammar2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(genGrammar2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(genGrammar2Parser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(genGrammar2Parser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#noErrorStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoErrorStatement(genGrammar2Parser.NoErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#noErrorStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoErrorStatement(genGrammar2Parser.NoErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(genGrammar2Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(genGrammar2Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(genGrammar2Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(genGrammar2Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(genGrammar2Parser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(genGrammar2Parser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(genGrammar2Parser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(genGrammar2Parser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(genGrammar2Parser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(genGrammar2Parser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(genGrammar2Parser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(genGrammar2Parser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(genGrammar2Parser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(genGrammar2Parser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(genGrammar2Parser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(genGrammar2Parser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(genGrammar2Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(genGrammar2Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(genGrammar2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(genGrammar2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#concatStr}.
	 * @param ctx the parse tree
	 */
	void enterConcatStr(genGrammar2Parser.ConcatStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#concatStr}.
	 * @param ctx the parse tree
	 */
	void exitConcatStr(genGrammar2Parser.ConcatStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(genGrammar2Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(genGrammar2Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(genGrammar2Parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(genGrammar2Parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(genGrammar2Parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(genGrammar2Parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(genGrammar2Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(genGrammar2Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(genGrammar2Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(genGrammar2Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(genGrammar2Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(genGrammar2Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(genGrammar2Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(genGrammar2Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(genGrammar2Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(genGrammar2Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(genGrammar2Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(genGrammar2Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(genGrammar2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(genGrammar2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(genGrammar2Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(genGrammar2Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(genGrammar2Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(genGrammar2Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(genGrammar2Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(genGrammar2Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(genGrammar2Parser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(genGrammar2Parser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#argumentExpressionList2}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList2(genGrammar2Parser.ArgumentExpressionList2Context ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#argumentExpressionList2}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList2(genGrammar2Parser.ArgumentExpressionList2Context ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(genGrammar2Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(genGrammar2Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genGrammar2Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(genGrammar2Parser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link genGrammar2Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(genGrammar2Parser.UnaryOperatorContext ctx);
}