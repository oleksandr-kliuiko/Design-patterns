package BehavioralPatterns.Visitor;

public class Main {
    public static void main(String[] args) {
        Element electronics = new Electronics(500.0);
        Element book = new Book(30.0);

        OrderVisitor orderVisitor = new OrderVisitor();

        electronics.accept(orderVisitor);
        book.accept(orderVisitor);

        double totalPrice = orderVisitor.getTotalPrice();
        System.out.println("Загальна вартість замовлення: " + totalPrice);
    }
}
