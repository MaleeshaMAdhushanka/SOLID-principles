package bad;

public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();

       Switch bulbSwitch =  new Switch(bulb);

         bulbSwitch.press();
         bulbSwitch.press();
         bulbSwitch.press();
         bulbSwitch.press();

    }
}
