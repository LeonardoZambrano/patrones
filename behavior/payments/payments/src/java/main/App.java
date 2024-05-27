import builder.Builder;
import builder.UserBuilder;
import entities.User;
import templates.DebitCardPayment;

public class App {
    public static void main(String[] args) throws Exception {

        // create user:

        Builder builder = new UserBuilder();

        builder = builder
                .setName("pedro")
                .setIdType("CC")
                .setIdNumer("12345")
                .setCardType("DEBIT_MASTERCARD")
                .setCardNumber("987654321");

        User user = ((UserBuilder) builder).build();

        DebitCardPayment payment = new DebitCardPayment();

        payment.processPayment(user, 1500);

    }
}
