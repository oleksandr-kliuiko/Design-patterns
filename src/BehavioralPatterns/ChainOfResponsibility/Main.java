package BehavioralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        OrderHandler orderReceiver = new OrderReceiver();
        OrderHandler orderConfirmation = new OrderConfirmationHandler();
        OrderHandler orderProcessing = new OrderProcessingHandler();
        OrderHandler orderExecution = new OrderExecutionHandler();

        ((OrderReceiver) orderReceiver).setNextHandler(orderConfirmation);
        ((OrderConfirmationHandler) orderConfirmation).setNextHandler(orderProcessing);
        ((OrderProcessingHandler) orderProcessing).setNextHandler(orderExecution);

        Order order = new Order("1111");
        orderReceiver.processOrder(order);
    }
}
