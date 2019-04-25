package me.yevgeny.training.designpatterns.structural.facade;

/**
 * @author Yevgeny Kuznetsov
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
