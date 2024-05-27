package mediators;

import colleagues.Colleague;

public interface Mediator {
    void notify(Colleague colleague);

    void startShipping();

    void savePackage();

    void startPackaging();

    void sendPackage();

    void setDealer(Colleague dealer);

    void setPacker(Colleague packer);

    void setStorer(Colleague storer);

}
