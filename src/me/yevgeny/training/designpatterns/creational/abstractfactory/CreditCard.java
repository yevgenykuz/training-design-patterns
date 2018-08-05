package me.yevgeny.training.designpatterns.creational.abstractfactory;

/**
 * An abstract credit card - the product of the abstract factory.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class CreditCard {

    protected int cardNumberLength;
    private int cscNumber;

    /**
     * Gets the cardNumberLength
     *
     * @return value of cardNumberLength
     */
    public int getCardNumberLength() {
        return cardNumberLength;
    }

    /**
     * Sets the cardNumberLength
     *
     * @param cardNumberLength
     *         the cardNumberLength
     */
    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    /**
     * Gets the cscNumber
     *
     * @return value of cscNumber
     */
    public int getCscNumber() {
        return cscNumber;
    }

    /**
     * Sets the cscNumber
     *
     * @param cscNumber
     *         the cscNumber
     */
    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
