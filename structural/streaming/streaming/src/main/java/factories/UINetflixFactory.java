package main.java.factories;

import main.java.products.ContentCard;
import main.java.products.MainMenu;
import main.java.products.Player;
import main.java.products.netflix.NetflixContentCard;
import main.java.products.netflix.NetflixMainMenu;
import main.java.products.netflix.NetflixPlayer;

public class UINetflixFactory implements UIFactory {

    @Override
    public MainMenu createMainMenu() {
        return new NetflixMainMenu();
    }

    @Override
    public Player createPlayer() {
        return new NetflixPlayer();
    }

    @Override
    public ContentCard createContentCard() {
        return new NetflixContentCard();
    }

}
