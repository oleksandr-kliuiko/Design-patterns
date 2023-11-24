package StructuralPatterns.Proxy;

public class Main {
    public static void main(String[] args) {
        IOrder order = new ProxyOrder();

        order.createOrder();
    }
}
