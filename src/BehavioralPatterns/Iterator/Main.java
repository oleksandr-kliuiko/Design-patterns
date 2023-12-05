package BehavioralPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new Product("Лаптоп"));
        order.addProduct(new Product("Миша"));
        order.addProduct(new Product("Клавіатура"));

        Iterator<Product> iterator = order.createIterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Товар: " + product.getName());
        }
    }
}
