package com.yevgenyk.training.designpatterns.behavioral.template;

/**
 * Another concrete order implementation which follows the rules of the template.
 *
 * @author Yevgeny Kuznetsov
 */
public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Bag items at counter");
    }

    @Override
    public void doDelivery() {
        System.out.println("Print receipt");
    }
}
