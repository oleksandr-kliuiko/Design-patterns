package BehavioralPatterns.ChainOfResponsibility;

public class OrderProcessingHandler implements OrderHandler {
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processOrder(Order order) {
        System.out.println("Обробка замовлення: " + order.getOrderNumber());
        // Передача замовлення далі по ланцюжку
        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }
}
