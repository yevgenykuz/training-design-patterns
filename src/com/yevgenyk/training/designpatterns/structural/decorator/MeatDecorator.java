package com.yevgenyk.training.designpatterns.structural.decorator;

/**
 * This is a decorator with a specific functionality.
 * <p>
 * It extends the "SandwichDecorator" to use its basic functionality.
 *
 * @author Yevgeny Kuznetsov
 * @see SandwichDecorator
 */
public class MeatDecorator extends SandwichDecorator {

    /**
     * Can accept other decorators as well, allowing to daisy-chain decorators
     */
    public MeatDecorator(Sandwich customSandwich) {
        // we call the base decorator, allowing decoration through composition, by modifying the SandwichDecorator's
        // customSandwich field
        super(customSandwich);
    }

    /**
     * This will return a decorated sandwich.
     *
     * @return The decorated sandwich
     */
    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    /**
     * The specific decoration of this decorator.
     *
     * @return The added decoration
     */
    private String addMeat() {
        return " + turkey";
    }
}
