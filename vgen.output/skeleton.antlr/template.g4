// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.expression.*;
	    import ast.definition.*;
	    import ast.statement.*;
	    import ast.type.*;
	    import ast.*;
}

program returns[Program ast]
    : definitions+=definition*            { $ast = new Program($definitions); }                  
	;

definition returns[Definition ast]
    : name=IDENT type                     { $ast = new VarDefinition($name, $type.ast); }        
    | name=IDENT fieldDefinitions+=fieldDefinition* { $ast = new StructDefinition($name, $fieldDefinitions); }
    | name=IDENT varDefinitions+=varDefinition* type? definitions+=definition* statements+=statement* { $ast = new FunctionDefinition($name, $varDefinitions, ($type.ctx == null) ? null : $type.ast, $definitions, $statements); }
    | name=IDENT type                     { $ast = new FieldDefinition($name, $type.ast); }      
	;

type returns[Type ast]
    :                                     { $ast = new IntType(); }                              
    |                                     { $ast = new FloatType(); }                            
    |                                     { $ast = new CharType(); }                             
    | INT_LITERAL type                    { $ast = new ArrayType($INT_LITERAL, $type.ast); }     
    | name=IDENT                          { $ast = new StructType($name); }                      
	;

fieldDefinition returns[FieldDefinition ast]
    : name=IDENT type                     { $ast = new FieldDefinition($name, $type.ast); }      
	;

varDefinition returns[VarDefinition ast]
    : name=IDENT type                     { $ast = new VarDefinition($name, $type.ast); }        
	;

statement returns[Statement ast]
    : expression                          { $ast = new Print($expression.ast); }                 
    | expression                          { $ast = new Read($expression.ast); }                  
    | name=IDENT expressions+=expression* { $ast = new FunctionCallStatement($name, $expressions); }
    | left=expression right=expression    { $ast = new Assignment($left.ast, $right.ast); }      
    | expression ifStatements+=statement* elseStatements+=statement* { $ast = new Conditional($expression.ast, $ifStatements, $elseStatements); }
    | expression loopStatements+=statement* { $ast = new While($expression.ast, $loopStatements); }
    | expression?                         { $ast = new Return(($expression.ctx == null) ? null : $expression.ast); }
	;

expression returns[Expression ast]
    : name=IDENT                          { $ast = new Variable($name); }                        
    | INT_LITERAL                         { $ast = new IntLiteral($INT_LITERAL); }               
    | FLOAT_LITERAL                       { $ast = new FloatLiteral($FLOAT_LITERAL); }           
    | CHAR_LITERAL                        { $ast = new CharLiteral($CHAR_LITERAL); }             
    | name=IDENT expressions+=expression* { $ast = new FunctionCallExpression($name, $expressions); }
    | expression name=IDENT               { $ast = new StructAccess($expression.ast, $name); }   
    | left=expression right=expression    { $ast = new ArrayAccess($left.ast, $right.ast); }     
    | type expression                     { $ast = new Cast($type.ast, $expression.ast); }       
    | left=expression operator=IDENT right=expression { $ast = new Arithmetic($left.ast, $operator, $right.ast); }
    | left=expression operator=IDENT right=expression { $ast = new Comparison($left.ast, $operator, $right.ast); }
    | left=expression operator=IDENT right=expression { $ast = new LogicBinary($left.ast, $operator, $right.ast); }
    | operator=IDENT expression           { $ast = new LogicUnary($operator, $expression.ast); } 
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
INT_LITERAL: [0-9]+;
CHAR_LITERAL: '\'' ~[\t\r\n] '\'' | '\'\\n\'';
