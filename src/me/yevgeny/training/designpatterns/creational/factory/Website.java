package me.yevgeny.training.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yevgeny Kuznetsov
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    /**
     * A concrete site will be created every time (a shop or a blog) - each has its own "createWebsite()"
     * implementation.
     */
    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    /**
     * Gets the pages
     *
     * @return value of pages
     */
    public List<Page> getPages() {
        return pages;
    }
}
