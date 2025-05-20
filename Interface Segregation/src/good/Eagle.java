package good;

public class Eagle extends Bird implements FlyingBird{
    @Override
    void eat() {
        System.out.println("Eagle can eat");
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
