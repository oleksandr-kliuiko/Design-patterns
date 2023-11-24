package StructuralPatterns.Facade;

public class Facade {
    private OnlineOrder order;
    private OrderVerification ver;

    public Facade() {
        order = new OnlineOrder();
        ver = new OrderVerification();
    }

    public void completeOrder() {
        order.takeOrder();
        ver.orderConfirmation();
        ver.orderConfirmed();
        order.processOrder();
        System.out.println("Замовлення виконане");
    }
}
