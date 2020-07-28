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
    private final ValidationStrategy strategy;

    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
