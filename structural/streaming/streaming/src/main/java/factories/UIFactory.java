package main.java.factories;

import main.java.products.ContentCard;
import main.java.products.MainMenu;
import main.java.products.Player;

public interface UIFactory {

    MainMenu createMainMenu();

    Player createPlayer();

    ContentCard createContentCard();

}
