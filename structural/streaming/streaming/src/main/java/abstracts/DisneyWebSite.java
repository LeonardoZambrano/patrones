package main.java.abstracts;

import main.java.factories.UIFactory;
import main.java.implemetations.Device;

public class DisneyWebSite extends StreamingWebSite {

    protected UIFactory disneyFactory;

    public DisneyWebSite(Device device, UIFactory factory) {
        super(device, factory);
    }

    @Override
    public void bodyRender() {
        createBody();
        device.play("small");
    }

    @Override
    public void headerRender() {
        System.out.println("create header abstract Disney");
    }

    private void createBody() {
        factory.createMainMenu();
        factory.createPlayer();
        factory.createContentCard();

    }

}
