package ro.ubb.statements;

import ro.ubb.expressions.IExpression;
import ro.ubb.state.ProgramState;

public record AssignmentStatement(
        String variableName,
        IExpression expression
) implements IStatement {

    @Override
    public void execute(ProgramState programState) {

    }
}
