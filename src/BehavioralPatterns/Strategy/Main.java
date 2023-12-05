package BehavioralPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.setDeliveryStrategy(new CourierDelivery());
        orderProcessor.processOrder("'Телефон'");

        orderProcessor.setDeliveryStrategy(new PostDelivery());
        orderProcessor.processOrder("'Книга'");
    }
}
