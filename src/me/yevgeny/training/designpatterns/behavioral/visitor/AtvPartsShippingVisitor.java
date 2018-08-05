package me.yevgeny.training.designpatterns.behavioral.visitor;

import java.util.List;

/**
 * This is a concrete visitor implementation. It handles all shipping amount calculating logic in one place by visiting
 * different elements. Each element visit has its own business logic.
 *
 * @author Yevgeny Kuznetsov
 */
public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 5;
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 13;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("More than 3 parts gives a shipping discount");

        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
