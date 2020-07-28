package me.yevgeny.training.designpatterns.structural.decorator;

/**
 * @author Yevgeny Kuznetsov
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
