package ro.ubb.expressions;

import ro.ubb.values.IValue;

public record ArithmeticExpression(
        IExpression firstOperand,
        IExpression secondOperand,
        ArithmeticOperator operator
) implements IExpression {

    @Override
    public IValue evaluate() {
        return null;
    }
}
