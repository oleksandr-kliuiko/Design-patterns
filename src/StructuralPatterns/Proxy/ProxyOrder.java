package StructuralPatterns.Proxy;

public class ProxyOrder implements IOrder {
    private Order order;

    @Override
    public void createOrder() {
        if (order == null) {
            order = new Order("Телефон");
        }

        order.createOrder();
        System.out.println("Замовлення створено");
    }
}