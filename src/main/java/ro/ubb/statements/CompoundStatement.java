package ro.ubb.statements;

import ro.ubb.state.ProgramState;

public record CompoundStatement(
        IStatement first,
        IStatement second
) implements IStatement {

    @Override
    public void execute(ProgramState programState) {

    }
}
