package com.yevgenyk.training.designpatterns.behavioral.template;

/**
 * This represents the template we want sub classes to use.
 * <p>
 * It contains abstract methods that must be overridden, a variable that may or may not be used, and final methods that
 * must not be changed.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class OrderTemplate {

    public boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift was wrapped");
    }

    /**
     * This method represents our algorithm.
     * <p>
     * We want it to be the same for all sub classes therefore its final (because we don't want it to be overridden).
     */
    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }
}
