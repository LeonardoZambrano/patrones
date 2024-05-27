package main.java.components;

public class BasicDelivery implements Delivery {

    @Override
    public void deliver() {
        System.out.println("method ' basic deliver'");
    }

    @Override
    public double generateCost() {
        System.out.println("method ' basic cost 100");
        return 100;
    }

}
