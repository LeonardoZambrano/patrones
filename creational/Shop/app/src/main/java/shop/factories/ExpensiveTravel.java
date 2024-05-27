package shop.factories;

import shop.products.Housing;
import shop.products.Ticket;
import shop.products.Tour;
import shop.products.expensive.ExpHousing;
import shop.products.expensive.ExpTicket;
import shop.products.expensive.ExpTour;

public class ExpensiveTravel implements AbstractFactory {

    @Override
    public Housing createHousing() {
        return new ExpHousing();
    }

    @Override
    public Ticket createTicket() {
        return new ExpTicket();
    }

    @Override
    public Tour createTour() {
        return new ExpTour();
    }

}
