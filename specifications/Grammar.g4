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
	| functionDefinition { $ast = $functionDefinition.ast; }
	;

functionDefinition returns [FunctionDefinition ast]
	: IDENT '(' parameters ')' ':' type '{' definitions+=definition* statements+=statement* '}'  { $ast = new FunctionDefinition($IDENT, $parameters.list, $type.ast, $definitions, $statements); }
	| IDENT '(' parameters ')' '{' definitions+=definition* statements+=statement* '}'  { $ast = new FunctionDefinition($IDENT, $parameters.list, null, $definitions, $statements); }
	;

fields returns [List<Field> list = new ArrayList<Field>()]
	: (field {$list.add($field.ast);})*
	;

field returns [Field ast]
	: IDENT ':' type ';' { $ast = new Field($IDENT, $type.ast); }
	;

parameters returns [List<VarDefinition> list = new ArrayList<VarDefinition>()]
	: (p1=parameter { $list.add($p1.ast); } (',' p2=parameter {$list.add($p2.ast);} )*)? 
	;

parameter returns [VarDefinition ast]
	: IDENT ':' type { $ast = new VarDefinition($IDENT, $type.ast); }
	;

statement returns [Statement ast]
	: ('print'|'printsp' | 'println') e=expression ';' { $ast = new Print($e.ast); }
	| 'read' e=expression ';' { $ast = new Read($e.ast); }
	| IDENT '(' (arguments+=expression (',' arguments+=expression )*)?  ')' { $ast = new FunctionCallStatement($IDENT, $arguments); }
	| left=expression '=' right=expression ';' { $ast = new Assignment($left.ast, $right.ast); }
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}' 'else' '{' elseStatements+=statement* '}' { $ast = new Conditional($e.ast, $ifStatements, $elseStatements); }
	| 'if' '(' e=expression ')' '{' ifStatements+=statement* '}'  { $ast = new Conditional($e.ast, $ifStatements, null); }
	| 'while' '(' e=expression ')' '{' loopStatements+=statement* '}' { $ast = new While($e.ast, $loopStatements); }
	| 'return' e=expression ';' { $ast = new Return($e.ast); }
	| 'return' ';' {$ast = new Return(null); }
	;

expression returns [Expression ast]
	: IDENT { $ast = new Variable($IDENT); }
	| INT_LITERAL { $ast = new IntLiteral($INT_LITERAL); }
	| FLOAT_LITERAL { $ast = new FloatLiteral($FLOAT_LITERAL); }
	| CHAR_LITERAL { $ast = new CharLiteral($CHAR_LITERAL); }
	| IDENT '(' (arguments+=expression (',' arguments+=expression )*)?  ')' { $ast = new FunctionCallExpression($IDENT, $arguments); }
	| e=expression '.' IDENT { $ast = new StructAccess($e.ast, $IDENT); }
	| left=expression '[' right=expression ']' { $ast = new ArrayAccess($left.ast, $right.ast); }
	| '(' expression ')' { $ast = $expression.ast; }
	| '<' type '>' '(' expression ')' { $ast = new Cast($type.ast, $expression.ast); }
	| '!' e=expression { $ast = new LogicNot($e.ast); }
	| left=expression operator=('*'|'/'|'%') right=expression { $ast = new Arithmetic($left.ast, $operator, $right.ast); }
	| left=expression operator=('+'|'-') right=expression { $ast = new Arithmetic($left.ast, $operator, $right.ast); }
	| left=expression operator=('<'|'>'|'<='|'>=') right=expression { $ast = new Logic($left.ast, $operator, $right.ast); }
	| left=expression operator=('!='|'==') right=expression { $ast = new Logic($left.ast, $operator, $right.ast); }
	| left=expression '&&' right=expression { $ast = new LogicAnd($left.ast, $right.ast); }
	| left=expression '||' right=expression { $ast = new LogicOr($left.ast, $right.ast); }
	;

type returns [Type ast]
	: 'int' { $ast = new IntType(); }
	| 'float' { $ast = new FloatType(); }
	| 'char' { $ast = new CharType(); }
	| '[' INT_LITERAL ']' type { $ast = new ArrayType($INT_LITERAL, $type.ast); }
	| IDENT { $ast = new StructType($IDENT); }
	;
