package builder;

import entities.User;

public class UserBuilder implements Builder {

    private String name;
    private String idNumer;
    private String idType;
    private String cardType;
    private String cardNumber;

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setIdNumer(String idNumber) {
        this.idNumer = idNumber;
        return this;
    }

    @Override
    public Builder setIdType(String idType) {
        this.idType = idType;
        return this;
    }

    @Override
    public Builder setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    @Override
    public Builder setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public User build() {
        return new User(name, idNumer, idType, cardType, cardNumber);
    }

}
