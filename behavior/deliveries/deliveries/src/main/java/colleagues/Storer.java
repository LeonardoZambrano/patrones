package colleagues;

import mediators.Mediator;

public class Storer extends Colleague {

    public Storer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println(message);
    }

    public void store() {
        System.out.println("Called store-colleague process and notify mediator");
        mediator.startPackaging();
    }

}
