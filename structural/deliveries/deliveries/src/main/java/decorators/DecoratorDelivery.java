package main.java.decorators;

import main.java.components.Delivery;

public abstract class DecoratorDelivery implements Delivery {

    protected Delivery deliveryDecorator;

    public DecoratorDelivery(Delivery deliveryDecorator) {
        this.deliveryDecorator = deliveryDecorator;

    }

    @Override
    public void deliver() {
        deliveryDecorator.deliver();

    }

    @Override
    public double generateCost() {
        return deliveryDecorator.generateCost();

    }

}
