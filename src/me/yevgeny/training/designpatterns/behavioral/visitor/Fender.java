package me.yevgeny.training.designpatterns.behavioral.visitor;

/**
 * This is a concrete element. It will be visited by the visitor.
 *
 * @author Yevgeny Kuznetsov
 */
public class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
