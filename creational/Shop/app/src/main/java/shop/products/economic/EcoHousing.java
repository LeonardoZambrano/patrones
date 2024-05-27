package shop.products.economic;

import shop.products.Housing;

public class EcoHousing implements Housing {

    @Override
    public void generateCost() {
        System.out.println("Cost by economic housing to rest");

    }

    @Override
    public void services() {
        System.out.println("Services include in econimic plan");

    }

}
