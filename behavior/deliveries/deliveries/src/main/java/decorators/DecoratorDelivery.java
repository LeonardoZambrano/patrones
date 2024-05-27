package decorators;

import components.Delivery;

public abstract class DecoratorDelivery implements Delivery {

    protected Delivery deliveryDecorator;

    public DecoratorDelivery(Delivery deliveryDecorator) {
        this.deliveryDecorator = deliveryDecorator;

    }

    @Override
    public void deliver(String deliver) {
        deliveryDecorator.deliver(deliver);

    }

    @Override
    public double generateCost() {
        return deliveryDecorator.generateCost();

    }

}
