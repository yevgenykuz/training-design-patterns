package com.yevgenyk.training.designpatterns.creational.abstractfactory;

/**
 * @author Yevgeny Kuznetsov
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // We pass 777 to get the amex card factory from the abstract factory:
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(777);
        // We pass platinum to get the amex platinum card from the amex factory:
        CreditCard amexPlatinumCard = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(amexPlatinumCard.getClass());

        // We pass 200 to get the visa card factory from the abstract factory:
        abstractFactory = CreditCardFactory.getCreditCardFactory(200);
        // We pass gold to get the visa gold card from the visa factory:
        CreditCard visaGoldCard = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(visaGoldCard.getClass());
    }
}
