package entities;

public class User {

    private String name;
    private String idNumer;
    private String idType;
    private String cardType;
    private String cardNumber;

    public User(String name, String idNumer, String idType, String cardType, String cardNumber) {
        this.name = name;
        this.idNumer = idNumer;
        this.idType = idType;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdNumer() {
        return idNumer;
    }

    public String getIdType() {
        return idType;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

}
