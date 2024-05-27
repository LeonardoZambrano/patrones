package shop.products.economic;

import shop.products.Tour;

public class EcoTour implements Tour {

    @Override
    public void generateCost() {
        System.out.println("Cost by economic tour to fun");

    }

    @Override
    public void putTransport() {
        System.out.println("Transport in economic plan");

    }

}
