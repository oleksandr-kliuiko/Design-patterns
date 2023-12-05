package BehavioralPatterns.Observer;

public class TemperatureDisplay implements TemperatureObserver {
    private String displayName;

    public TemperatureDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void updateTemperature(double temperature) {
        System.out.println(displayName + ": Температура змінилась на " + temperature + " градусів.");
    }
}
