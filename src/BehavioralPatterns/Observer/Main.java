package BehavioralPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        TemperatureObserver display1 = new TemperatureDisplay("Дисплей 1");
        TemperatureObserver display2 = new TemperatureDisplay("Дисплей 2");

        temperatureSensor.addTemperatureObserver(display1);
        temperatureSensor.addTemperatureObserver(display2);

        temperatureSensor.setTemperature(-6);

        temperatureSensor.removeTemperatureObserver(display1);

        temperatureSensor.setTemperature(-5);
    }
}
