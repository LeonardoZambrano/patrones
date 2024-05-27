package shop.factories;

import shop.products.Housing;
import shop.products.Ticket;
import shop.products.Tour;

public interface AbstractFactory {

    Ticket createTicket();

    Housing createHousing();

    Tour createTour();

}
