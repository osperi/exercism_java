
class NeedForSpeed {

    int speed = 5;
    int batteryDrain = 1;
    int distance = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return this.battery < batteryDrain;
    }

    public int distanceDriven() {
        return (int) this.distance;
    }

    public void drive() {
        if (this.battery <= 0) {
            return;
        }
        this.distance += this.speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance = 0;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if (car.batteryDrained()) {
            return false;
        }
        int batteryLife = car.battery / car.batteryDrain;
        int distanceRemaining = car.speed * batteryLife;
        return distanceRemaining >= this.distance;
    }
}
