package com.yevgenyk.training.designpatterns.behavioral.strategy;

/**
 * This is an abstract validation strategy.
 *
 * @author Yevgeny Kuznetsov
 */
public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);

    /** Used to validate credit card number - https://en.wikipedia.org/wiki/Luhn_algorithm */
    protected boolean passesLuhn(String ccNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
