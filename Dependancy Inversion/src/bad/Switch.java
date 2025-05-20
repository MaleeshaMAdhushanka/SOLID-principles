package bad;

public class Switch {

    private Bulb bulb;
    private Fan fan;

    public Switch(Bulb bulb){
        this.bulb = bulb;
    }
    public Switch(Fan fan){
        this.fan = fan;
    }

    public void press(){
        if (fan != null) {
            fan.toggle();
        } else if (bulb != null) {
            bulb.toggle();
        }
    }
}
