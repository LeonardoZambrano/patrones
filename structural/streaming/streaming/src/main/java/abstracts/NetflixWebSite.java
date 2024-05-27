package main.java.abstracts;

import main.java.factories.UIFactory;
import main.java.implemetations.Device;

public class NetflixWebSite extends StreamingWebSite {

    public NetflixWebSite(Device device, UIFactory factory) {
        super(device, factory);
    }

    @Override
    public void bodyRender() {
        double width = device.getScreeenWidth();
        double heigth = device.getScreeenHeigth();

        if (width % heigth >= 2) {
            device.play("Big");
        } else {
            device.play("Normal");
        }

    }

    @Override
    public void headerRender() {
        System.out.println("create header abstract Netflix");

    }

}
