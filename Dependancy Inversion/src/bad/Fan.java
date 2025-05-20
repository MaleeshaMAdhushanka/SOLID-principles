package bad;

public class Fan {
    private boolean isOn = false;

    public void  toggle(){
        isOn = !isOn;

        if (isOn) {
            System.out.println("The fan is ON");
        } else {
            System.out.println("The fan is OFF");
        }
    }
}
