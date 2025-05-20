package sampleTwo;

public class Airplane extends Vehicle implements FlyingVehicle{
    @Override
    public void startEngine() {
        System.out.println("Airplane engine started");
    }

    @Override
    public void move() {
        System.out.println("Airplane is moving");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
