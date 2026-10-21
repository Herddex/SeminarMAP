package ro.ubb.expressions;

import ro.ubb.values.IValue;

public record ValueExpression(IValue value) implements IExpression {

    @Override
    public IValue evaluate() {
        return value;
    }
}
