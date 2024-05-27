package decorators;

import components.Delivery;

public class BasicFastDeliveryWithRoute extends DecoratorDelivery {

    private String route;

    public BasicFastDeliveryWithRoute(Delivery deliveryDecorator, String route) {
        super(deliveryDecorator);
        this.route = route;
    }

    @Override
    public void deliver(String deliver) {
        System.out.println("method fast deliver plus and route: " + route);
        super.deliver(deliver);
    }

    @Override
    public double generateCost() {
        return super.generateCost() + 100;
    }

}
