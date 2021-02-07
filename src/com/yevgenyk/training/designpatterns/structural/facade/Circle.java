package com.yevgenyk.training.designpatterns.structural.facade;

/**
 * @author Yevgeny Kuznetsov
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
