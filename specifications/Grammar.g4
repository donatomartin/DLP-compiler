grammar Grammar;

import Tokenizer;

@header {
	import ast.*;
	import ast.type.*;
	import ast.statement.*;
	import ast.expression.*;
	import ast.definition.*;
}

program returns [Program ast]
	: definitions+=definition* EOF { $ast = new Program($definitions); }
	;

definition returns [Definition ast]
	: 'var' IDENT ':' type ';' { $ast = new VarDefinition($IDENT, $type.ast); }
	| 'struct' IDENT '{' fields '}' { $ast = new StructDefinition($IDENT, $fields.list); }
	| IDENT '(' parameters ')' ':' type '{' definitions+=definition* statements+=statement* '}'  { $ast = new FunctionDefinition($IDENT, $parameters.list, $type.ast, $definitions, $statements); }
	;

fields returns [List<Field> list = new ArrayList<Field>()]
	: (field {$list.add($field.ast);})*
	;

field returns [Field ast]
	: IDENT ':' type ';' { $ast = new Field($IDENT, $type.ast); }
	;

parameters returns [List<Parameter> list = new ArrayList<Parameter>()]
	: (p1=parameter { $list.add($p1.ast); } (',' p2=parameter {$list.add($p2.ast);} )*)? 
	;

parameter returns [Parameter ast]
	: IDENT ':' type { $ast = new Parameter($IDENT, $type.ast); }
	;

statement returns [Statement ast]
	: ('print'|'printsp' | 'println') expression (','expression)* ';' { $ast = new Print($expression.ast); }
	| 'read' expression ';' { $ast = new Read($expression.ast); }
	| expression ';' { $ast = new Call($expression.ast); }
	| left=expression '=' right=expression ';' { $ast = new Assignment($left.ast, $right.ast); }
	| 'if' '(' expression ')' '{' ifStatements+=statement* '}' ('else' '{' elseStatements+=statement* '}')? { $ast = new Conditional($expression.ast, $ifStatements, $elseStatements); }
	| 'while' '(' expression ')' '{' loopStatements+=statement* '}' { $ast = new While($expression.ast, $loopStatements); }
	| 'return' (expression)? ';' { $ast = new Return($expression.ast); }
	;

expression returns [Expression ast]
	: IDENT { $ast = new Variable($IDENT); }
	| INT_LITERAL { $ast = new IntLiteral($INT_LITERAL); }
	| FLOAT_LITERAL { $ast = new FloatLiteral($FLOAT_LITERAL); }
	| CHAR_LITERAL { $ast = new CharLiteral($CHAR_LITERAL); }
	| IDENT '(' arguments ')' { $ast = new FunctionCall($IDENT, $arguments.list); }
	| expression '.' IDENT { $ast = new StructAccess($expression.ast, $IDENT); }
	| left=expression '[' right=expression ']' { $ast = new ArrayAccess($right.ast, $right.ast); }
	| '(' expression ')' { $ast = $expression.ast; }
	| '<' type '>' '(' expression ')' { $ast = new Cast($type.ast, $expression.ast); }
	| left=expression operator=('*'|'/'|'%') right=expression { $ast = new Arithmetic($left.ast, $operator, $right.ast); }
	| left=expression operator=('+'|'-') right=expression { $ast = new Arithmetic($left.ast, $operator, $right.ast); }
	| left=expression operator=('<'|'>'|'<='|'>=') right=expression { $ast = new Logic($left.ast, $operator, $right.ast); }
	| left=expression operator=('!='|'==') right=expression { $ast = new Logic($left.ast, $operator, $right.ast); }
	| left=expression '&&' right=expression { $ast = new LogicAnd($left.ast, $right.ast); }
	| left=expression '||' right=expression { $ast = new LogicOr($left.ast, $right.ast); }
	| '!' e=expression { $ast = new LogicNot($e.ast); }
	;

arguments returns [List<Expression> list = new ArrayList<Expression>()]
	: (e1=expression { $list.add($e1.ast); } (',' e2=expression {$list.add($e2.ast);} )*)? 
	;

type returns [Type ast]
	: 'int' { $ast = new IntType(); }
	| 'float' { $ast = new FloatType(); }
	| 'char' { $ast = new CharType(); }
	| '[' INT_LITERAL ']' type { $ast = new ArrayType($INT_LITERAL, $type.ast); }
	| IDENT { $ast = new StructType($IDENT); }
	;
