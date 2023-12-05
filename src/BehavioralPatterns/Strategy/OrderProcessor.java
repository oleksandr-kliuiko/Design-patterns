package BehavioralPatterns.Strategy;

public class OrderProcessor {
    private DeliveryStrategy strategy;

    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(String product) {
        strategy.delivery(product);
    }
}
