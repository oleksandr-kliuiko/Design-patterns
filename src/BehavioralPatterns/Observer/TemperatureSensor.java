package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements TemperatureSubject {
    private List<TemperatureObserver> temperatureObservers;
    private double temperature;

    public TemperatureSensor() {
        temperatureObservers = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyTemperatureObservers(temperature);
    }

    @Override
    public void addTemperatureObserver(TemperatureObserver observer) {
        temperatureObservers.add(observer);
    }

    @Override
    public void removeTemperatureObserver(TemperatureObserver observer) {
        temperatureObservers.remove(observer);
    }

    @Override
    public void notifyTemperatureObservers(double temperature) {
        for (TemperatureObserver observer : temperatureObservers) {
            observer.updateTemperature(temperature);
        }
    }
}
