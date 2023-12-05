package BehavioralPatterns.Interpreter;

public class CelsiusExpression extends TemperatureExpression {
    private double temperature;

    public CelsiusExpression(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double interpret() {
        return temperature;
    }
}
