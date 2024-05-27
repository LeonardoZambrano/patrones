package templates;

import entities.User;

public abstract class TemplatePayment {

    public final void processPayment(User user, double amountPay) {

        if (validateUser(user.getIdType(), user.getIdNumer())) {

            if (validateMethodPayment(user.getCardType())) {
                double amount = amountAccount(user.getCardNumber());
                if (amount > amountPay) {
                    makePayment(user.getCardNumber(), amount);
                } else {
                    System.out.println("insufficient balance");
                }

            } else {
                System.out.println("card allie unable, try later");
            }

        } else {
            System.out.println("not payment proccess");
        }

    }

    protected abstract boolean validateMethodPayment(String cardType);

    protected abstract double amountAccount(String cardNumber);

    protected abstract void makePayment(String cardNumber, double amount);

    protected boolean validateUser(String idType, String idNumber) {
        System.out.println("validate user template");
        return !idType.isEmpty() && idNumber.length() == 5;
    }

}
