package com.yevgenyk.training.designpatterns.creational.factory;

/**
 * @author Yevgeny Kuznetsov
 */
public class Shop extends Website {

    /**
     * The concrete website creation, used by the factory.
     */
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
