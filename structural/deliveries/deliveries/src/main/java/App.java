package main.java;

import main.java.components.BasicDelivery;
import main.java.components.Delivery;
import main.java.decorators.BasicFastDeliveryWithRoute;
import main.java.decorators.BasicProtectedDelivery;

public class App {
    public static void main(String[] args) throws Exception {
        Delivery firstDelivery = new BasicDelivery();
        firstDelivery.deliver();
        // Proceso decorador; usuario solicita entrega rapida

        Delivery fastDelivery = new BasicFastDeliveryWithRoute(firstDelivery, "principal Avenue");
        double fastDeliveryCost = fastDelivery.generateCost();
        System.out.println("cost ' fast deliver '" + fastDeliveryCost);
        fastDelivery.deliver();

        // usuario solicita entrega rapida y protegida

        Delivery fastProtectedDelivery = new BasicProtectedDelivery(fastDelivery);
        double fastProtectedDeliveryCost = fastProtectedDelivery.generateCost();
        System.out.println("cost ' fast-protected cost '" + fastProtectedDeliveryCost);
        fastProtectedDelivery.deliver();

        // usuario solicita entrega protegida

        Delivery protectedDelivery = new BasicProtectedDelivery(firstDelivery);
        double protectedDeliveryCost = protectedDelivery.generateCost();
        System.out.println("cost ' protected cost '" + protectedDeliveryCost);
        protectedDelivery.deliver();

    }
}
