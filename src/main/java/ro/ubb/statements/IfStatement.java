package ro.ubb.statements;

import ro.ubb.expressions.IExpression;
import ro.ubb.state.ProgramState;

public record IfStatement(
     IExpression condition,
     IStatement thenBranch,
     IStatement elseBranch
) implements IStatement {

    @Override
    public void execute(ProgramState programState) {

    }
}
