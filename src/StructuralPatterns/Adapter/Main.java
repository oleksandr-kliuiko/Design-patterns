package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(135);

        Adapter adapter = new Adapter(fahrenheitTemperature);
        double celsius = adapter.getCelsiusTemperature();

        System.out.println("cels " + celsius);
    }
}
