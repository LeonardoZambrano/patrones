package shop.products.expensive;

import shop.products.Ticket;

public class ExpTicket implements Ticket {

    @Override
    public void generateCost() {
        System.out.println("Cost by expensive ticket to fly");

    }

    @Override
    public void generatePath() {
        System.out.println("Route in flight exp");

    }

}
