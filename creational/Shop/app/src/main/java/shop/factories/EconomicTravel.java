package shop.factories;

import shop.products.Housing;
import shop.products.Ticket;
import shop.products.Tour;
import shop.products.economic.EcoHousing;
import shop.products.economic.EcoTicket;
import shop.products.economic.EcoTour;

public class EconomicTravel implements AbstractFactory {

    @Override
    public Ticket createTicket() {
        return new EcoTicket();
    }

    @Override
    public Housing createHousing() {
        return new EcoHousing();
    }

    @Override
    public Tour createTour() {
        return new EcoTour();
    }

}
