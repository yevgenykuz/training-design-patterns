package me.yevgeny.training.designpatterns.creational.abstractfactory;

/**
 * An abstract credit card - the product of the abstract factory.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class CreditCard {

    private int cardNumberLength;
    private int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
