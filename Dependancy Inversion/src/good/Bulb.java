package good;

public class Bulb implements Device {
    private boolean isOn = false;

    @Override
    public void toggle() {
      isOn = !isOn;

        if (isOn) {
            System.out.println("The bulb is ON");
        } else {
            System.out.println("The bulb is OFF");
        }
    }
}
