package com.yevgenyk.training.designpatterns.structural.flyweight;

/**
 * @author Yevgeny Kuznetsov
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println(String.format("Ordering %s for order number %d", item, orderNumber));
    }
}
