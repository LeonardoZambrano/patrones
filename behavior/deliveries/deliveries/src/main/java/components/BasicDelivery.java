package components;

import colleagues.Colleague;
import colleagues.Dealer;
import colleagues.Packer;
import colleagues.Storer;
import mediators.Mediator;

public class BasicDelivery implements Delivery {

    protected Mediator mediator;

    public BasicDelivery(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void deliver(String deliver) {
        System.out.println("method ' basic deliver'");

        Colleague packer = new Packer(mediator);
        Colleague storer = new Storer(mediator);
        Colleague dealer = new Dealer(mediator, deliver);

        setObjectMediator(dealer, packer, storer);

        mediator.startShipping();
    }

    @Override
    public double generateCost() {
        System.out.println("method ' basic cost 100");
        return 100;
    }

    private void setObjectMediator(Colleague dealer, Colleague packer, Colleague storer) {
        mediator.setDealer(dealer);
        mediator.setPacker(packer);
        mediator.setStorer(storer);

    }

}
