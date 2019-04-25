package me.yevgeny.training.designpatterns.creational.prototype;

/**
 * @author Yevgeny Kuznetsov
 */
public class Book extends Item {

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
