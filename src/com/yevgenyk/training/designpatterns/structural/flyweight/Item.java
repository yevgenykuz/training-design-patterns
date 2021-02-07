package com.yevgenyk.training.designpatterns.structural.flyweight;

/**
 * This is the implementation of a flyweight.
 * <p>
 * Item instances will be the flyweights.
 * <p>
 * It is immutable (no setters, final name).
 *
 * @author Yevgeny Kuznetsov
 */
public class Item {

    private final String name;


    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


