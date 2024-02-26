grammar Grammar;

import Tokenizer;

program
	: definition* statement* EOF
	;

definition
	: 'var' IDENT ':' ('[' expr ']')* type ';'
	| 'struct' IDENT '{' (IDENT ':' ('[' expr ']')* type ';')* '}'
	| IDENT '(' (expr ':' type (',' expr ':' type)*)? ')' (':' type)? '{' definition* statement* '}'
	;

statement
	: 'print' expr ';'
	| 'printsp' expr ';'
	| 'println' expr ';'
	| 'read' IDENT (('[' expr ']') | ('.' IDENT))* ';'
	| IDENT (('[' expr ']') | ('.' IDENT))* '=' expr ';'
	| IDENT '(' (expr (',' expr)*)? ')' ';'
	| 'if' '(' expr ')' '{' statement* '}' ('else' '{' statement* '}')?
	| 'while' '(' expr ')' '{' statement* '}'
	| 'return' (expr)? ';'
	;

expr
	: IDENT ('(' (expr (',' expr)*)? ')')? (('[' expr ']') | ('.' IDENT))*
	| FLOAT_LITERAL
	| INT_LITERAL
	| CHAR_LITERAL
	| '(' expr ')'
	| '<' type '>' '(' expr ')'
	| expr ('!='|'=='|'<'|'>'|'<='|'>=') expr
	| expr '||' expr
	| expr '&&' expr
	| '!' expr
	| expr ('+'|'-') expr
	| expr ('*'|'/') expr
	;

type
	: 'int'
	| 'float'
	| 'char'
	| IDENT
	;
