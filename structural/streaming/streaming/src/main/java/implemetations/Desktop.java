package main.java.implemetations;

public class Desktop implements Device {

    @Override
    public double getScreeenWidth() {
        return 3.0;
    }

    @Override
    public double getScreeenHeigth() {
        return 1.0;
    }

    @Override
    public void play(String size) {
        System.out.println("Desktop Device with: " + size);

    }

}
