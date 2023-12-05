package BehavioralPatterns.Interpreter;

public class ToCelsiusExpression extends TemperatureExpression {
    private TemperatureExpression temperatureExpression;

    public ToCelsiusExpression(TemperatureExpression temperatureExpression) {
        this.temperatureExpression = temperatureExpression;
    }

    @Override
    public double interpret() {
        return temperatureExpression.interpret();
    }
}
