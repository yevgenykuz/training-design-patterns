package com.yevgenyk.training.designpatterns.creational.abstractfactory;

/**
 * @author Yevgeny Kuznetsov
 */
public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
