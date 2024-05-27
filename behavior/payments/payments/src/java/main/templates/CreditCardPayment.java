package templates;

public class CreditCardPayment extends TemplatePayment {

    @Override
    protected boolean validateMethodPayment(String cardType) {
        System.out.println("validate method Credit Card");
        // call extern service
        return cardType.equals("CREDIT_VISA");
    }

    @Override
    protected double amountAccount(String cardNumber) {
        System.out.println("get amount");
        // call extern service
        return cardNumber.contains("50") ? 1000 : 5000;

    }

    @Override
    protected void makePayment(String cardNumber, double amount) {
        System.out.println("make payment credit");

    }

}
