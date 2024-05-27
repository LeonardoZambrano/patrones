package shop.products.expensive;

import shop.products.Tour;

public class ExpTour implements Tour {

    @Override
    public void generateCost() {
        System.out.println("Cost by expensive tour to fun");

    }

    @Override
    public void putTransport() {
        System.out.println("Transport in expensive plan");

    }

}
