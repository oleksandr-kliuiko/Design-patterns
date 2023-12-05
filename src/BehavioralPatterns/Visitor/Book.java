package BehavioralPatterns.Visitor;

public class Book implements Element {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
