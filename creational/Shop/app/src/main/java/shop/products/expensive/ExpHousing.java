package shop.products.expensive;

import shop.products.Housing;

public class ExpHousing implements Housing {

    @Override
    public void generateCost() {
        System.out.println("Cost by expensive housing to rest");

    }

    @Override
    public void services() {
        System.out.println("Services include in expensive plan");

    }

}
