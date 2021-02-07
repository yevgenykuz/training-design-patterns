package com.yevgenyk.training.designpatterns.structural.decorator;

/**
 * This is another decorator with a specific functionality.
 * <p>
 * It extends the "SandwichDecorator" to use its basic functionality.
 *
 * @author Yevgeny Kuznetsov
 * @see SandwichDecorator
 */
public class DressingDecorator extends SandwichDecorator {

    /**
     * Can accept other decorators as well, allowing to daisy-chain decorators
     */
    public DressingDecorator(Sandwich customSandwich) {
        // we call the base decorator, allowing decoration through composition, by modifying the "SandwichDecorator"s
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
        return customSandwich.make() + addDressing();
    }

    /**
     * The specific decoration of this decorator.
     *
     * @return The added decoration
     */
    private String addDressing() {
        return " + mustard";
    }
}
