package ro.ubb.expressions;

import ro.ubb.values.IValue;

public record LogicalExpression(
        IExpression firstOperand,
        IExpression secondOperand,
        BooleanOperator operator
) implements IExpression {

    @Override
    public IValue evaluate() {
        return null;
    }
}
