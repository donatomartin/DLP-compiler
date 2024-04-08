package codegeneration;

import ast.*;
import ast.definition.FunctionDefinition;
import ast.definition.StructDefinition;
import ast.definition.VarDefinition;
import visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }
    
    	@Override
	public Object visit(Program program, Object param) {

        int currentAddress = 0;

        for (var varDefinition : program.definitions()
                .filter(VarDefinition.class::isInstance)
                .map(VarDefinition.class::cast)
                .toList()) {

            varDefinition.accept(this, param);

			varDefinition.setAddress(currentAddress);

            currentAddress += varDefinition.getType().getSize();
		}

        for (var structDefinition : program.definitions()
                .filter(StructDefinition.class::isInstance)
                .map(StructDefinition.class::cast)
                .toList()) {

			structDefinition.accept(this, param);

            structDefinition.setAddress(currentAddress);

            for (Field field : structDefinition.getFields()) {
                field.setAddress(currentAddress);
                currentAddress += field.getType().getSize();
            }

		}

		// program.getDefinitions().forEach(definition -> definition.accept(this, param));
		super.visit(program, param);

		return null;
	}

    // class FunctionDefinition(String name, List<VarDefinition> varDefinitions, Optional<Type> type, List<Definition> definitions, List<Statement> statements)
	@Override
	public Object visit(FunctionDefinition functionDefinition, Object param) {

		for (var varDefinition : functionDefinition.getVarDefinitions()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

        for (var varDefinition : functionDefinition.definitions()
                .filter(VarDefinition.class::isInstance)
                .map(VarDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// varDefinition.setAddress(?);
		}

        for (var structDefinition : functionDefinition.definitions()
                .filter(StructDefinition.class::isInstance)
                .map(StructDefinition.class::cast)
                .toList()) {

			// TODO: Remember to initialize INHERITED attributes <----
			// structDefinition.setAddress(?);
		}
    }

}
