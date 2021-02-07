package com.yevgenyk.training.designpatterns.structural.facade;

/**
 * This is the facade that allows easy drawing of shapes.
 * <p>
 * It hides the complexity of the actual shapes drawing (- the "bad" API we want to hide).
 *
 * @author Yevgeny Kuznetsov
 */
public class ShapeMaker {

    private final Shape square;
    private final Shape circle;
    private final Shape rectangle;

    public ShapeMaker() {
        square = new Square();
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
