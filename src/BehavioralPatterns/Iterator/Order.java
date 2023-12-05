package BehavioralPatterns.Iterator;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new java.util.ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new OrderIterator(products);
    }
}
