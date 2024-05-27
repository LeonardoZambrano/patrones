import components.BasicDelivery;
import components.Delivery;
import decorators.BasicFastDeliveryWithRoute;
import mediators.DispatchHandler;
import mediators.Mediator;

public class App {
    public static void main(String[] args) throws Exception {

        Mediator mediator = new DispatchHandler();

        Delivery firstDelivery = new BasicDelivery(mediator);
        firstDelivery.deliver("Pedro");

        // Proceso decorador; usuario solicita entrega rapida

        Delivery fastDelivery = new BasicFastDeliveryWithRoute(firstDelivery, "principal Avenue");
        double fastDeliveryCost = fastDelivery.generateCost();
        System.out.println("cost ' fast deliver '" + fastDeliveryCost);
        fastDelivery.deliver("Andres");

    }
}
