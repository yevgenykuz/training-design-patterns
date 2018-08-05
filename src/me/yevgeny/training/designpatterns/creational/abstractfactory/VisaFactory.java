package me.yevgeny.training.designpatterns.creational.abstractfactory;

/**
 * This is a concrete factory that extends the abstract CreditCardFactory. It is used to create concrete Visa credit
 * cards.
 *
 * @author Yevgeny Kuznetsov
 * @see CreditCardFactory
 */
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
