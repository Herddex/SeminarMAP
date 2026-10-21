package ro.ubb.expressions;

import ro.ubb.values.IValue;

public record VariableExpression(String variableName) implements IExpression {

    @Override
    public IValue evaluate() {
        return null; //TODO
    }
}
