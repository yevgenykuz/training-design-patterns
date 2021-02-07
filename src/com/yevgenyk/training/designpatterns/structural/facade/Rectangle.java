package com.yevgenyk.training.designpatterns.structural.facade;

/**
 * @author Yevgeny Kuznetsov
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
