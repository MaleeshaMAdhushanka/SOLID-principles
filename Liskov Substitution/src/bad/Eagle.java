package bad;

public class Eagle extends Bird{
    @Override
    void eat() {
        System.out.println("Eagle can eat");
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}
