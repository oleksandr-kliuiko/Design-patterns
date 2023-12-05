package BehavioralPatterns.Strategy;

public class PostDelivery implements DeliveryStrategy {
    @Override
    public void delivery(String product) {
        System.out.println("Доставка " + product + " поштовою службою");
    }
}
