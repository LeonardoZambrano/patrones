package main.java.factories;

import main.java.products.ContentCard;
import main.java.products.MainMenu;
import main.java.products.Player;
import main.java.products.disney.DisneyContentCard;
import main.java.products.disney.DisneyMainMenu;
import main.java.products.disney.DisneyPlayer;

public class UIDisneyFactory implements UIFactory {

    @Override
    public MainMenu createMainMenu() {
        return new DisneyMainMenu();
    }

    @Override
    public Player createPlayer() {
        return new DisneyPlayer();
    }

    @Override
    public ContentCard createContentCard() {
        return new DisneyContentCard();
    }

}
