package ro.ubb.statements;

import ro.ubb.state.ProgramState;

public record NoOperationStatement() implements IStatement {

    @Override
    public void execute(ProgramState programState) {
        // Does nothing
    }
}
