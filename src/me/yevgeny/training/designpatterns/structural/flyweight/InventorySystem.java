package me.yevgeny.training.designpatterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Yevgeny Kuznetsov
 */
public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    /**
     * A lookup is performed in the catalog to re-use previously created Item objects that match the given itemName.
     *
     * @see Catalog
     */
    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\nTotal Item objects made: " + catalog.totalItemsMade();
    }
}
