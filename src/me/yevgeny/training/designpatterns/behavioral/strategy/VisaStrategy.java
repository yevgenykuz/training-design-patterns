package me.yevgeny.training.designpatterns.behavioral.strategy;

/**
 * Another concrete validation strategy. It holds specific rules for validation.
 *
 * @author Yevgeny Kuznetsov
 */
public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;
        isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passessLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}