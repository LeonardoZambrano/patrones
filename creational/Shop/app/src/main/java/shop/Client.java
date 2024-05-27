package shop;

import shop.factories.AbstractFactory;

public class Client {

    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void generateBooking() {

        factory.createTicket().generateCost();
        factory.createTour().generateCost();
        factory.createHousing().generateCost();

    }

}
