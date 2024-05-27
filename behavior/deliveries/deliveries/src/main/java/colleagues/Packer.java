package colleagues;

import mediators.Mediator;

public class Packer extends Colleague {

    public Packer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println(message);
    }

    public void pack() {
        System.out.println("The packer make package and notify to mediator");
        mediator.sendPackage();

    }

}
