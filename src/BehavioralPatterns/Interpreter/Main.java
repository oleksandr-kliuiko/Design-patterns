package BehavioralPatterns.Interpreter;

public class Main {
    public static void main(String[] args) {
        TemperatureExpression expression1 = new ToCelsiusExpression(new FahrenheitExpression(58));

        double result1 = expression1.interpret();
        System.out.println("Результат: " + result1 + " градусів Цельсія");

        TemperatureExpression expression2 = new ToFahrenheitExpression(new CelsiusExpression(48));

        double result2 = expression2.interpret();
        System.out.println("Результат: " + result2 + " градусів Фаренгейту");
    }
}
