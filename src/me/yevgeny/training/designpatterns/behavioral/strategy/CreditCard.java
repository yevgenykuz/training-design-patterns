package me.yevgeny.training.designpatterns.behavioral.strategy;

/**
 * This is an object that uses different validation strategies to test if its valid.
 * <p>
 * This object isn't concerned with actual validation strategy implementation - it can be changed on object creation.
 *
 * @author Yevgeny Kuznetsov
 */
public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    /**
     * Gets the number
     *
     * @return value of number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number
     *
     * @param number
     *         the number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the date
     *
     * @return value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date
     *
     * @param date
     *         the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the cvv
     *
     * @return value of cvv
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the cvv
     *
     * @param cvv
     *         the cvv
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
