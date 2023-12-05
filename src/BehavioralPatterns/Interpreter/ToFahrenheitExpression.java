package BehavioralPatterns.Interpreter;

public class ToFahrenheitExpression extends TemperatureExpression {
    private TemperatureExpression temperatureExpression;

    public ToFahrenheitExpression(TemperatureExpression temperatureExpression) {
        this.temperatureExpression = temperatureExpression;
    }

    @Override
    public double interpret() {
        return temperatureExpression.interpret() * 9.0/5.0 + 32;
    }
}
