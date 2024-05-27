package main.java;

import main.java.abstracts.DisneyWebSite;
import main.java.abstracts.NetflixWebSite;
import main.java.abstracts.StreamingWebSite;
import main.java.factories.UIDisneyFactory;
import main.java.factories.UIFactory;
import main.java.factories.UINetflixFactory;
import main.java.implemetations.Desktop;
import main.java.implemetations.Device;
import main.java.implemetations.Mobile;

public class App {
    public static void main(String[] args) throws Exception {
        Device deviceMobile = new Mobile();
        UIFactory factoryNetflix = new UINetflixFactory();
        StreamingWebSite netflix = new NetflixWebSite(deviceMobile, factoryNetflix);
        netflix.bodyRender();

        Device deviceDesktop = new Desktop();
        UIFactory disneyFactory = new UIDisneyFactory();
        StreamingWebSite disney = new DisneyWebSite(deviceDesktop, disneyFactory);
        disney.bodyRender();

    }
}
