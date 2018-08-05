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

    /**
     * Gets the title
     *
     * @return value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     *
     * @param title
     *         the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the price
     *
     * @return value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price
     *
     * @param price
     *         the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the url
     *
     * @return value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url
     *
     * @param url
     *         the url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
