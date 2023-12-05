package BehavioralPatterns.Interpreter;

public class FahrenheitExpression extends TemperatureExpression {
    private double temperature;

    public FahrenheitExpression(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double interpret() {
        return (temperature - 32) * 5.0/9.0;
    }
}
