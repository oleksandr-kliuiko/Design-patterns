package BehavioralPatterns.Observer;

public interface TemperatureSubject {
    void addTemperatureObserver(TemperatureObserver observer);
    void removeTemperatureObserver(TemperatureObserver observer);
    void notifyTemperatureObservers(double temperature);
}
