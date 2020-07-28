package me.yevgeny.training.designpatterns.behavioral.interpreter;

/**
 * This represents an "or" expression that handles 2 expressions.
 * <p>
 * It is not a terminal expression - each expression can be broken down to more expressions.
 *
 * @author Yevgeny Kuznetsov
 */
public class OrExpression implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
