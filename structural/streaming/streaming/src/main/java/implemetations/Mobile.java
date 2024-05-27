package main.java.implemetations;

public class Mobile implements Device {

    @Override
    public double getScreeenWidth() {
        return 1.0;
    }

    @Override
    public double getScreeenHeigth() {
        return 3.0;
    }

    @Override
    public void play(String size) {
        System.out.println("Mobile Device with: " + size);

    }

}
