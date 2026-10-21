package ro.ubb.statements;

import ro.ubb.state.ProgramState;

public interface IStatement {
    void execute(ProgramState programState);
}
