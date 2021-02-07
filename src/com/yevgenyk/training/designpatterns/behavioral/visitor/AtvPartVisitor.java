package com.yevgenyk.training.designpatterns.behavioral.visitor;

/**
 * This is the visitor interface. It defines the logic that the visitor should implement.
 * <p>
 * Implementing this interface when adding new visitors, doesn't require changing element objects
 *
 * @author Yevgeny Kuznetsov
 */
public interface AtvPartVisitor {

    void visit(Fender fender);

    void visit(Oil oil);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);
}
