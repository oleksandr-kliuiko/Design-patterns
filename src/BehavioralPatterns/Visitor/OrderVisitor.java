package BehavioralPatterns.Visitor;

public class OrderVisitor implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visit(Electronics electronics) {
        totalPrice += electronics.getPrice();
    }

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
