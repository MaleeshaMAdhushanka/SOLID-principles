package sampleTwo;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
