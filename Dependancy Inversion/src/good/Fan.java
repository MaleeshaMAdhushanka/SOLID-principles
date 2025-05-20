package good;

public class Fan implements Device {
    private boolean isOn = false;
    @Override
    public void toggle() {
        isOn = !isOn;

        if (isOn) {
            System.out.println("The fan is ON");
        } else {
            System.out.println("The fan is OFF");
        }
    }
}
