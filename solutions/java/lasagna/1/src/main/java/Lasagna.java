public class Lasagna {

    private int expectedMinutesInOven = 40;
    private int minutesPerLayer = 2;

    // DONE: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    // DONE: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven - minutes;
    }

    // DONE: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * minutesPerLayer;
    }

    // DONE: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
