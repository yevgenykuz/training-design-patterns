package me.yevgeny.training.designpatterns.structural.decorator;

/**
 * This is a simple sandwich that implements a sandwich interface. This is what we want to decorate to add
 * functionality.
 *
 * @author Yevgeny Kuznetsov
 * @see Sandwich
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
