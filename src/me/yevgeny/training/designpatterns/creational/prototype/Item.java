package me.yevgeny.training.designpatterns.creational.prototype;

/**
 * This is the prototype class.
 * <p>
 * It implements Cloneable interface, to allow the client to clone this class to create new object (by using the clone()
 * method), without using the "new" keyword.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
