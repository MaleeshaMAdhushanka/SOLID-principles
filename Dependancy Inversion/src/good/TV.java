package good;

public class TV implements Device {
    private boolean isOn = false;

    @Override
    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("The TV is ON");
        } else {
            System.out.println("The TV is OFF");
        }
    }
}
