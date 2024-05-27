package templates;

public class DebitCardPayment extends TemplatePayment {

    @Override
    protected boolean validateMethodPayment(String cardType) {
        System.out.println("validate method Debit Card");
        // call extern service
        return cardType.equals("DEBIT_MASTERCARD");
    }

    @Override
    protected double amountAccount(String cardNumber) {
        System.out.println("get amount");
        // call extern service
        return cardNumber.contains("45") ? 1000 : 5000;
    }

    @Override
    protected void makePayment(String cardNumber, double amount) {
        System.out.println("make payment debit");
    }

}
