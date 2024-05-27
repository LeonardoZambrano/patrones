package main.java.abstracts;

import main.java.factories.UIFactory;
import main.java.implemetations.Device;

public abstract class StreamingWebSite {

    protected Device device;
    protected UIFactory factory;

    public StreamingWebSite(Device device, UIFactory factory) {
        this.device = device;
        this.factory = factory;
    }

    public abstract void bodyRender();

    public abstract void headerRender();

}
