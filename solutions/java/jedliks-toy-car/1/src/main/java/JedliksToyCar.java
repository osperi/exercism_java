
public class JedliksToyCar {

    public static JedliksToyCar buy() {
        return (new JedliksToyCar());
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
            if (battery < 0) {
                battery = 0;
            }
        }
    }

    private long distance;
    private long battery;

    public JedliksToyCar() {
        this.distance = 0L;
        this.battery = 100L;
    }
}
