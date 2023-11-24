package StructuralPatterns.Decorator;

public class PhoneOrderDecorator extends OrderDecorator {
    public PhoneOrderDecorator(Order order) {
        super(order);
    }

    public void takeOrder() {
        System.out.println("Замовлення по телефону отримано");
    }

    @Override
    public void processOrder() {
        System.out.println("Замовлення по телефону виконується");
    }
}
