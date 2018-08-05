package me.yevgeny.training.designpatterns.structural.decorator;

/**
 * This is the base of the decorators that will change the "SimpleSandwich" functionality.
 * <p>
 * It implements the "Sandwich" interface so it can be used like a "Sandwich".
 *
 * @author Yevgeny Kuznetsov
 * @see Sandwich
 */
public abstract class SandwichDecorator implements Sandwich {

    /** Holds the sandwich that will be decorated */
    protected Sandwich customSandwich;

    /**
     * Can accept other decorators as well, allowing to daisy-chain decorators
     *
     * @param customSandwich
     */
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }

}
