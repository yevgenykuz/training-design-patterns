package com.yevgenyk.training.designpatterns.behavioral.visitor;

/**
 * This is another concrete element. It will be visited by the visitor.
 *
 * @author Yevgeny Kuznetsov
 */
public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
