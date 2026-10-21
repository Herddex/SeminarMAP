package ro.ubb;

import ro.ubb.expressions.*;
import ro.ubb.statements.*;
import ro.ubb.types.BoolType;
import ro.ubb.types.IntType;
import ro.ubb.values.BoolValue;
import ro.ubb.values.IntValue;

public class Main {
    static void main() {
        IStatement[] statements = new IStatement[]{
                new VariableDeclarationStatement(IntType.INSTANCE, "a"),
                new VariableDeclarationStatement(IntType.INSTANCE, "b"),
                new VariableDeclarationStatement(BoolType.INSTANCE, "c"),
                new AssignmentStatement("a", new ValueExpression(new IntValue(5))),
                new AssignmentStatement("b", new ArithmeticExpression(
                        new ArithmeticExpression(
                                new VariableExpression("a"),
                                new ValueExpression(new IntValue(2)),
                                ArithmeticOperator.ADD
                        ),
                        new ValueExpression(new IntValue(3)),
                        ArithmeticOperator.SUB
                )),
                new AssignmentStatement(
                        "c",
                        new LogicalExpression(
                                new ValueExpression(new BoolValue(true)),
                                new ValueExpression(new BoolValue(false)),
                                BooleanOperator.OR
                        )
                ),
                new IfStatement(
                        new VariableExpression("c"),
                        new PrintStatement(
                                new VariableExpression("b")
                        ),
                        new PrintStatement(
                                new VariableExpression("a")
                        )
                )
        };

        IStatement program = statements[statements.length - 1];
        for(int i = statements.length - 2; i >= 0; i--) {
            program = new CompoundStatement(statements[i], program);
        }
        IO.println(program);
    }
}
