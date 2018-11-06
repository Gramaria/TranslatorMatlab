grammar genGrammar2;

options
{
	language = Java;
}

@parser::namespace { Generated }
@lexer::namespace  { Generated }
@header{
        package tree02;
        import java.util.*;
        import java.lang.*;
        import java.io.*;
}

@members{
	public String memory = new String("");
                    public String dop = new String("");
}
@rulecatch
{
    catch (RecognitionException e) 
    {
        // Çäåñü Âû ìîæåòå îáðàáîòàòü èñêëþ÷åíèå
        throw e;
    }
}
genGrammar2
    : prog EOF
    ;
prog
    : program {memory = $program.value;}
    ;
program returns[String value]
    :   compound {$value =$compound.value;}
    |   newFunc {$value =$newFunc.value;}
    ;
//unit returns[String value]
//    : declaration? compound ('end')? {$value = $compound.value;}
//    ;
newFunc returns[String value]
    : dec = declaration c = compoundIn ('end')? {$value = $dec.value + $c.value + "\n    return " + $dec.vars;}
    ;
declaration returns[String value, String vars]
    : 'function' ('[')? v1 = varSet2 (']')? '=' v2 = funcName '(' v3 = varSet ')' 
      {$value = "def " + $v2.value + "(" + $v3.value + "):"; $vars = $v1.value; }
    ;
funcName returns[String value]
    : name1 =  ID {$value = $name1.text;}
    ;
varSet returns[String value]
    : varName {$value = "*" + $varName.value;}
    | v1 = varSet ',' v2 = varName {$value = $v1.value + "," + "*" + $v2.value;}
    ;

varSet2 returns[String value]
    : varName {$value = $varName.value;}
    | v1 = varSet2 ',' v2 = varName {$value = $v1.value + "," + $v2.value;}
    ;

compound returns[String value]
    :  {$value = "";} (statement {$value =$value +"\n" + $statement.value ;})*
    ;

compoundIn returns[String value]
    :  {$value = ""; dop = dop + "    ";} (statement {$value =$value +"\n" + dop + $statement.value;})* {dop = dop.substring(0, dop.length()-4);}
    ;

statement returns[String value]
    :   labeledStatement {$value = $labeledStatement.value;}
    |   expressionStatement {$value = $expressionStatement.value;}
    |   selectionStatement {$value = $selectionStatement.value;}
    |   iterationStatement {$value = $iterationStatement.value;}
    |   jumpStatement {$value = $jumpStatement.value;}
    |   noErrorStatement {$value = $noErrorStatement.value;}
    |   'mlock' {$value = "";}
    |   'global' (ID+) ';' {$value = "";}
    |   outputStatement {$value = $outputStatement.value;}
    |   functionStatement {$value = $functionStatement.value;}
    ;

outputStatement returns[String value]
    : 'disp' expression (';')? {$value = "print" + $expression.value;}
    ;

noErrorStatement returns[String value]
    : 'try' compoundIn 'catch' f4 = ID compoundIn 'end' 
      {$value = "try: " + $compoundIn.value + "except" + $f4.text + ": " + $compoundIn.value;}
    ;

labeledStatement returns[String value]
    :   'case' constantExpression ',' compoundIn {$value = "case" + $constantExpression.value + "," + $compoundIn.value;}
        //'otherwise'
    ;
expressionStatement returns[String value]
    :   exp10 = expression ';' {$value = $exp10.value;}
    ;
selectionStatement returns[String value, String dop]
    :   'if' 'nargout' '>' z = CONST compound {$value  = $compound.value;} 'end' (';')?   
    |    'if' expression {$value = "if " + $expression.value + ": ";} (',')? compoundIn {$value  = $value + $compoundIn.value;} 
        (('else' {$value = $value + "\n"+ dop +"else: ";} | 'elseif' {$value = $value + "\n"+ dop +"elif ";} 
                        expression {$value = $value + $expression.value + ": ";}  (',')?) 
                        compoundIn {$value = $value + $compoundIn.value;})? 'end' (';')?
    |   'switch' expression compoundIn 'end' {$value = "switch " + $expression.value + " " + $compoundIn.value + "end";} 
        (';' {$value = $value + ";"; $dop = "";})?
    ;
iterationStatement returns[String value]
    :   w1 = While expression (',')? compoundIn 'end' {$value = $w1.text+" "+$expression.value+": "+$compoundIn.value;} (';')?
    |   'for' f1 = forCondition {$value = "for " + $f1.value;} (',')?      //(','|';')? 
        comp1 = compoundIn 'end' {$value = $value + $comp1.value;} ';'      //(';')?
    ;
forCondition returns[String value]
    :   varName '=' int1 = CONST ':' {$value = $varName.value+" in range("+$int1.text+",";}
        (int2 = CONST ':' {$value = $value;})? (int3 = CONST {$value = $value + $int3.text+"):";}
                                                              | int3 = ID {$value = $value + $int3.text+"):";})
    ;
varName returns[String value]
    : name2 = ID {$value = $name2.text;}
    ;
jumpStatement returns[String value]
    :   'break' ';' {$value = "break";}
    |   'return' {$value = "return";}
    |   'continue' ';' {$value = "continue";}
    ;

functionStatement returns[String value]
    :  ('[')? exp4 = argumentExpressionList2  (']')? exp5 = assignmentOperator 'feval' '(' /*'@'*/ f1 = funcName ',' 
       ('[')? f2 = argumentExpressionList2  (']')? ')' ';'{$value = $exp4.value + " = " + $f1.value + "(" + $f2.value + ")";}
    ;

constantExpression returns[String value]
    :   logicalOrExpression {$value = $logicalOrExpression.value;}
    ;
expression returns[String value]
    :   logicalOrExpression {$value = $logicalOrExpression.value;}
    |   u1 = unaryExpression u2 = assignmentOperator u3 = expression 
        {$value = $u1.value+" "+$u2.value+" "+$u3.value;}
    | 'strcat' '(' concatStr ')' (';')? {$value = $concatStr.value;}
    | 'num2str' '(' exp = expression ')' {$value = "str(" + $exp.value + ")";}
    |   exp1 = DigitSequence {$value = $exp1.text;}// for
    ;

concatStr returns[String value]
    :   expression {$value = $expression.value;}
    |   arg = concatStr ',' exp = expression {$value = $arg.value+"+"+$exp.value;}
    ;

assignmentOperator returns[String value]
    :   '=' {$value = "=";}|  '+=' {$value = "+=";}| '-=' {$value = "-=";}
    ;
logicalOrExpression returns[String value]
    :   log3 = logicalAndExpression {$value = $log3.value;}
    |   log2 = logicalOrExpression '||' log3 = logicalAndExpression {$value = $log2.value + " or " + $log3.value;}
    ;
logicalAndExpression returns[String value]
    :   inc2 = inclusiveOrExpression {$value = $inc2.value;}
    |   log1 = logicalAndExpression '&&' inc2 = inclusiveOrExpression {$value = $log1.value+" and "+$inc2.value;}
    ;

inclusiveOrExpression returns[String value]
    :  ex2 = exclusiveOrExpression {$value = $ex2.value;}
    |   inc1 = inclusiveOrExpression '|' ex2 = exclusiveOrExpression {$value = $inc1.value + " or " + $ex2.value;}
    ;
exclusiveOrExpression returns[String value]
    :   and2 = andExpression {$value = $and2.value;}
    |   ex1 = exclusiveOrExpression '^' and2 = andExpression {$value = $ex1.value + "^" + $and2.value;}
    ;
andExpression returns[String value]
    :   eq2 = equalityExpression {$value = $eq2.value;}
    |   and1 = andExpression '&' eq2 = equalityExpression {$value = $and1.value + " and " + $eq2.value;}
    ;
equalityExpression returns[String value]
    :   rel2 = relationalExpression {$value = $rel2.value;}
    |   eq1 = equalityExpression '==' rel2 = relationalExpression {$value = $eq1.value + "==" + $rel2.value;}
    |   eq1 = equalityExpression '~=' rel2 = relationalExpression {$value = $eq1.value + "!=" + $rel2.value;}  
    ;
relationalExpression returns[String value]
    :   add2 = additiveExpression {$value = $add2.value;}
    |   rel1 = relationalExpression '<' add2 = additiveExpression {$value = $rel1.value + "<" + $add2.value;}
    |   rel1 = relationalExpression '>' add2 = additiveExpression {$value = $rel1.value + ">" + $add2.value;}
    |   rel1 = relationalExpression '<=' add2 = additiveExpression {$value = $rel1.value + "<=" + $add2.value;}
    |   rel1 = relationalExpression '>=' add2 = additiveExpression {$value = $rel1.value + ">=" + $add2.value;}
    ;
additiveExpression returns[String value]
    :   mult2 = multiplicativeExpression {$value = $mult2.value;}
    |   add1 = additiveExpression '+' mult2 = multiplicativeExpression {$value = $add1.value + "+" + $mult2.value;}
    |   add1 = additiveExpression '-' mult2 = multiplicativeExpression {$value = $add1.value + "-" + $mult2.value;}
    ;
multiplicativeExpression returns[String value]
    :   c1 = castExpression {$value = $c1.value;}
    |   mult1 = multiplicativeExpression '*' c1 = castExpression {$value = $mult1.value + "*" + $c1.value;}
    |   mult1 = multiplicativeExpression '/' c1 =castExpression {$value = $mult1.value + "/" + $c1.value;}
    ;
castExpression returns[String value]
    :   un1 = unaryExpression {$value = $un1.value;}
    |   c1 = DigitSequence {$value = $c1.text;}// for
    ;
unaryExpression returns[String value]
    :   p2 = postfixExpression {$value = $p2.value; }
    |   un = unaryOperator c = castExpression {$value = $un.value + " " + $c.value;}
    ;
postfixExpression returns[String value]
    :   p = primaryExpression {$value = $p.value;}
    |   p1 = postfixExpression '[' {$value =$p1.value+"[";} 
        (argumentExpressionList2 {$value =$value+$argumentExpressionList2.value;})? ']' {$value =$value+"]";}
    |   p1 = postfixExpression '(' {$value =$p1.text+"[";} 
         (pr2 = CONST {$value = $value + Integer.toString(Integer.parseInt($pr2.text)-1);} | ':' {$value = $value + ":";}) 
         ( ',' {$value = $value + ",";}(pr3 = CONST {$value = $value + Integer.toString(Integer.parseInt($pr3.text)-1);} 
                                       | ':' {$value = $value + ":";} ) )? ')' {$value = $value + "]";}
    |   p1 = postfixExpression '(' {$value =$p1.value+"(";} 
        (argumentExpressionList2 {$value =$value+$argumentExpressionList2.value;})? ')' {$value =$value+")";}
    |   p1 = postfixExpression '{' {$value = $p1.value + "{";} (p2 = CONST {$value = $value + $p2.text;}
                                                               |':' {$value = $value + ":";}) '}' {$value = $value + "}";}   
    |   p1 = postfixExpression '.' p2 = ID {$value =$p1.value+"."+$p2.text;}
    ;
argumentExpressionList returns[String value]
    :  expression {$value = $expression.value;}
    |   arg1 = argumentExpressionList ',' exp1 = expression {$value = $arg1.value+","+$exp1.value;}
    ;
argumentExpressionList2 returns[String value]
    :   expression {$value = $expression.value;}
    |   arg1 = argumentExpressionList2 {$value = $arg1.value;}  (',')? 
        exp1 = expression {$value = $value + ", " + $exp1.value;}
    ;
primaryExpression returns[String value]
    :   pr1 = ID {$value = $pr1.text;}
    |   pr1 = CONST {$value = $pr1.text;}
    |   pr1 = StringLit+ {$value = $pr1.text;}
    |   '(' expression ')' {$value ="("+$expression.value+")";}
    |   '[' (arg = argumentExpressionList2 {$value =$arg.value;})? ']' {$value ="["+$value+"]";}
//   |   '@' funcName {$value =$funcName.value;}
   ;
unaryOperator returns[String value]
    :    '*' {$value = "*";} | '+' {$value = "+";}| '-' {$value = "-";}| '~' {$value = "not ";}| '!' {$value = "not ";}
    ;

End : 'end';
Function : 'function';
Break : 'break';
Case : 'case';
Else : 'else';
ElseIf : 'elseif';
For : 'for';
If : 'if';
Return : 'return';
Switch : 'switch';
While : 'while';
Global : 'global';
Try : 'try';
Catch : 'catch';
Continue : 'continue';
MLock : 'mlock';
Strcat : 'strcat';
Disp : 'disp';
Num2str : 'num2str';
Feval : 'feval';
Nargout : 'nargout';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';

Plus : '+';
Minus : '-';
Star : '*';
Div : '/';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';
At : '@';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';
Point : '.';

Assign : '=';
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
TildaAssign : '~=';

Equal : '==';
NotEqual : '!=';


ID: (Nondigit (Nondigit | Digit)*)+ ;
fragment Nondigit: [a-zA-Z_] ;
fragment Digit: [0-9] ;

CONST: Int | Float ;

Int
        :   Sign? NozeroDigit (Digit)*
        ;
fragment NozeroDigit: [1-9];

fragment Float
        :   FractionalConstant Exp?
        |   DigitSequence Exp
        ;
fragment FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;
fragment Exp
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;
fragment Sign: '-' ;
DigitSequence: Digit+ ;
//fragment String: [A-Za-z]*;

StringLit
    : '\'' SCharSequence? '\''
    ;
fragment
SCharSequence
    :   SChar+
    ;
fragment
SChar
    :   (~["\\\r\n])|'"'|'\\'.
    ;

WHITESPACE: (' '|'\t') -> skip ;
COMMENT: '%' ~[\r\n]* -> skip ;
NEWLINE: ('\r' '\n'? | '\n') -> skip ;
ELLIPSIS: '...' -> skip ;
