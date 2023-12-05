package BehavioralPatterns.ChainOfResponsibility;

public class OrderReceiver implements OrderHandler {
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processOrder(Order order) {
        System.out.println("Отримано замовлення: " + order.getOrderNumber());
        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }

}
