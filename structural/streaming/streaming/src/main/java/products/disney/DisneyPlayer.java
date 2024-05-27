package main.java.products.disney;

import main.java.products.Player;

public class DisneyPlayer implements Player {

    public DisneyPlayer() {
        System.out.println("create Player Disney");
    }

    @Override
    public void generatePlayer() {
        throw new UnsupportedOperationException("Unimplemented method 'generatePlayer'");
    }

    @Override
    public void generateSubtitles() {
        throw new UnsupportedOperationException("Unimplemented method 'generateSubtitles'");
    }

}
