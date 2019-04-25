package me.yevgeny.training.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yevgeny Kuznetsov
 */
public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    /**
     * Here we demonstrate the prototype design pattern by using the clone() method of the item prototype.
     */
    public Item createItem(String type) {
        Item item = null;

        try {
            /* We must cast this because clone() from the Cloneable interface returns an object, and
             * doesn't use generics. We can implement our own interface to prevent this.
             */
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    /**
     * Here we create a prototype for a Movie and a Book. The contain default information we wish to share with other
     * Movie and a Book objects.
     * <p>
     * Each one will be cloned when creating a new Movie or a new Book, accordingly.
     *
     * <u>Important note:</u>
     * A <b>shallow copy</b> will be performed. All Movie objects will point to the same title, price, url and runtime.
     * This can be dangerous if using mutable types - a value change in one Movie object will affect all Movie objects.
     * To avoid this, a deep copy cloning must be implemented.
     */
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Movie");
        movie.setPrice(23.99);
        movie.setRuntime("1.5 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(254);
        book.setPrice(14.99);
        book.setTitle("Book");
        items.put("Book", book);
    }
}
