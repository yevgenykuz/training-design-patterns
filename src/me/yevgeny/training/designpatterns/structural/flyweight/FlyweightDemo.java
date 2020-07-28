package me.yevgeny.training.designpatterns.structural.flyweight;

/**
 * @author Yevgeny Kuznetsov
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 421);
        inventorySystem.takeOrder("Roomba", 21);
        inventorySystem.takeOrder("Bose Headphones", 31);
        inventorySystem.takeOrder("Samsung TV", 41);
        inventorySystem.takeOrder("Roomba", 22);
        inventorySystem.takeOrder("Bose Headphones", 36);
        inventorySystem.takeOrder("Samsung TV", 429);
        inventorySystem.takeOrder("Roomba", 179);
        inventorySystem.takeOrder("Bose Headphones", 315);
        inventorySystem.takeOrder("Samsung TV", 123);
        inventorySystem.process();

        // only 3 different item types exist, so only 3 Item objects will be created - even though we have 12 orders:
        System.out.println(inventorySystem.report());
    }
}
