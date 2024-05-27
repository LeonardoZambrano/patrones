package main.java.decorators;

import main.java.components.Delivery;

public class BasicFastDeliveryWithRoute extends DecoratorDelivery {

    private String route;

    public BasicFastDeliveryWithRoute(Delivery deliveryDecorator, String route) {
        super(deliveryDecorator);
        this.route = route;
    }

    @Override
    public void deliver() {
        System.out.println("method fast deliver plus and route: " + route);
        super.deliver();
    }

    @Override
    public double generateCost() {
        return super.generateCost() + 100;
    }

}
