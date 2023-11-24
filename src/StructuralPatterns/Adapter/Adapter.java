package StructuralPatterns.Adapter;

public class Adapter implements CelsiusTemperature {
    private FahrenheitTemperature fahrenheitTemperature;

    public Adapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }
    @Override
    public double getCelsiusTemperature() {
        return (fahrenheitTemperature.getTemperature() - 32) * 5 / 9;
    }
}
