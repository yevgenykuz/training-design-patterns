package com.yevgenyk.training.designpatterns.creational.abstractfactory;

/**
 * This is a concrete factory that extends the abstract CreditCardFactory. It is used to create concrete Amex credit
 * cards.
 *
 * @author Yevgeny Kuznetsov
 * @see CreditCardFactory
 */
public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                break;
        }
        return null;
    }
}
