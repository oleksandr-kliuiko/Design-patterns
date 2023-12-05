package BehavioralPatterns.ChainOfResponsibility;

public class OrderExecutionHandler implements OrderHandler {
    public void processOrder(Order order) {
        System.out.println("Виконання замовлення: " + order.getOrderNumber());
    }
}
