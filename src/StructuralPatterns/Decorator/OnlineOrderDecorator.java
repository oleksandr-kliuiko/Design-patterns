package StructuralPatterns.Decorator;

public class OnlineOrderDecorator extends OrderDecorator {
    public OnlineOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void takeOrder() {
        System.out.println("Онлайн-замовлення отримано");
    }

    @Override
    public void processOrder() {
        System.out.println("Онлайн-замовлення виконується");
    }
}
