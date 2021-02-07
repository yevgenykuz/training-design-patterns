package com.yevgenyk.training.designpatterns.behavioral.strategy;

/**
 * Another concrete validation strategy. It holds specific rules for validation.
 *
 * @author Yevgeny Kuznetsov
 */
public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid;
        isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
