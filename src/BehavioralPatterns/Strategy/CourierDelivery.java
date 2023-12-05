package BehavioralPatterns.Strategy;

public class CourierDelivery implements DeliveryStrategy {

    @Override
    public void delivery(String product) {
        System.out.println("Доставка " + product + " кур'єрською службою");
    }
}
