package shop.products.economic;

import shop.products.Ticket;

public class EcoTicket implements Ticket {

    @Override
    public void generateCost() {
        System.out.println("Cost by economic ticket to fly");

    }

    @Override
    public void generatePath() {
        System.out.println("Route in flight eco");

    }

}
