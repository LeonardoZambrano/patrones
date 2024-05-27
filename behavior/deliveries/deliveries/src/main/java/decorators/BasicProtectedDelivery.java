package decorators;

import components.Delivery;

public class BasicProtectedDelivery extends DecoratorDelivery {

    public BasicProtectedDelivery(Delivery deliveryDecorator) {
        super(deliveryDecorator);
    }

    @Override
    public void deliver(String deliver) {
        generateProteted(deliver);
    }

    @Override
    public double generateCost() {
        return super.generateCost() <= 100 ? super.generateCost() * 2.5 : super.generateCost() * 1.5;
    }

    private void generateProteted(String deliver) {
        System.out.println("method ' protected deliver'");
        super.deliver(deliver);
    }

}
