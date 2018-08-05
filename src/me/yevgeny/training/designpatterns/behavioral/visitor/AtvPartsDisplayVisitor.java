package me.yevgeny.training.designpatterns.behavioral.visitor;

/**
 * This is another concrete visitor implementation. It displays inventory by visiting different elements. Each element
 * visit has its own business logic.
 *
 * @author Yevgeny Kuznetsov
 */
public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have a oil");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have a order");
    }
}
