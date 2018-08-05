package me.yevgeny.training.designpatterns.behavioral.strategy;

/**
 * @author Yevgeny Kuznetsov
 */
public class StrategyDemo {
    public static void main(String[] args) {
        // The client must know which validation strategy it want's to use:
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("02/2095");
        amexCard.setCvv("999");

        // A valid ccn:
        System.out.println("Is Amex valid: " + amexCard.isValid());

        // Invalid ccn:
        amexCard.setNumber("479185883464283");
        System.out.println("Is Amex valid: " + amexCard.isValid());

        // A different strategy:
        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("02/2095");
        visaCard.setCvv("999");

        // A valid ccn:
        System.out.println("Is Visa valid: " + visaCard.isValid());

        // Invalid ccn:
        visaCard.setNumber("3539589763663402");
        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
