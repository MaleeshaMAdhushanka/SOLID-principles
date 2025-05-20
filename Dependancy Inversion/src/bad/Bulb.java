package bad;

public class Bulb {
    private boolean isOn = false;

    public void  toggle(){
        isOn = !isOn;
        if (isOn) {
            System.out.println("The bulb is ON");
        } else {
            System.out.println("The bulb is OFF");
        }
    }
}
