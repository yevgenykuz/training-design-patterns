package me.yevgeny.training.designpatterns.structural.facade;

/**
 * @author Yevgeny Kuznetsov
 */
public class FacadeDemo {

    public static void main(String[] args) {
        System.out.println("Creating a shape maker facade");
        ShapeMaker shapeMaker = new ShapeMaker();

        // The facade allows easy usage by the client:
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
