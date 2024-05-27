package mediators;

import colleagues.Colleague;
import colleagues.Dealer;
import colleagues.Packer;
import colleagues.Storer;

public class DispatchHandler implements Mediator {

    private Dealer dealer;
    private Packer packer;
    private Storer storer;

    @Override
    public void notify(Colleague colleague) {
        if (colleague instanceof Dealer) {
            System.out.println("Finish dealer: " + dealer.getName());
        }
    }

    @Override
    public void startShipping() {
        System.out.println("Called shipping process in mediator");
        _notifyAll();
        savePackage();
    }

    @Override
    public void savePackage() {
        System.out.println("Called save package in mediator");
        storer.store();
    }

    @Override
    public void startPackaging() {
        System.out.println("Called packaging in mediator");
        packer.pack();
    }

    @Override
    public void sendPackage() {
        dealer.deliver();

    }

    public void setDealer(Colleague dealer) {
        this.dealer = (Dealer) dealer;
    }

    public void setPacker(Colleague packer) {
        this.packer = (Packer) packer;
    }

    public void setStorer(Colleague storer) {
        this.storer = (Storer) storer;
    }

    private void _notifyAll() {
        packer.receive("Prepare to new Shipping packer");
        storer.receive("Prepare to new Shipping Storer");
        dealer.receive("Prepare to new Shipping Dealer");

    }

}
