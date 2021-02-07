package com.yevgenyk.training.designpatterns.creational.abstractfactory;

/**
 * @author Yevgeny Kuznetsov
 */
public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
