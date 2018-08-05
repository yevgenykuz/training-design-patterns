package me.yevgeny.training.designpatterns.creational.prototype;

/**
 * @author Yevgeny Kuznetsov
 */
public class Book extends Item {

    private int numberOfPages;

    /**
     * Gets the numberOfPages
     *
     * @return value of numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the numberOfPages
     *
     * @param numberOfPages
     *         the numberOfPages
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
