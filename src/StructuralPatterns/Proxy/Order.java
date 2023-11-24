package StructuralPatterns.Proxy;

public class Order implements IOrder {
    private String item;

    public Order(String item) {
        this.item = item;
    }
    @Override
    public void createOrder() {
        System.out.println("Створити замовлення: " + item);
    }

    public String getItem() {
        return item;
    }
}
