package main.java.products.disney;

import main.java.products.ContentCard;

public class DisneyContentCard implements ContentCard {

    public DisneyContentCard() {
        System.out.println("create ContentCard Disney");
    }

    @Override
    public void selectOption() {
        throw new UnsupportedOperationException("Unimplemented method 'selectOption'");
    }

    @Override
    public void generateCards() {
        throw new UnsupportedOperationException("Unimplemented method 'generateCards'");
    }

}
