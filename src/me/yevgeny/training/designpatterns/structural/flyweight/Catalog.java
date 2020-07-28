package me.yevgeny.training.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a Item factory that caches Item flyweight objects.
 *
 * @author Yevgeny Kuznetsov
 * @see Item
 */
public class Catalog {

    private final Map<String, Item> items = new HashMap<>();

    /**
     * To save memory, a new Item object is created only if itemName is new.
     * <p>
     * An old Item object will be returned and reused if itemName was used already.
     */
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
