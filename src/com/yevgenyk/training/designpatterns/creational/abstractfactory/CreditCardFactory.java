package com.yevgenyk.training.designpatterns.creational.abstractfactory;

/**
 * This is the abstract factory. Concrete factories will extend this, and will be used to create concrete "CreditCard"
 * products.
 *
 * @author Yevgeny Kuznetsov
 * @see VisaFactory
 * @see AmexFactory
 */
public abstract class CreditCardFactory {

    // Here we decide what concrete factory to return:
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
