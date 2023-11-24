package StructuralPatterns.Decorator;

public class SimpleOrder implements Order {

    @Override
    public void takeOrder() {
        System.out.println("Замовлення отримано");
    }

    @Override
    public void processOrder() {
        System.out.println("Замовлення виконується");
    }
}
