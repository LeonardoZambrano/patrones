package colleagues;

import mediators.Mediator;

public class Dealer extends Colleague {

    protected String name;

    public String getName() {
        return name;
    }

    public Dealer(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void receive(String message) {
        System.out.println(message + " " + name);
    }

    public void deliver() {
        System.out.println("Called deliver in dealer " + name + " and finish notify mediator");
        mediator.notify(this);
    }

}
