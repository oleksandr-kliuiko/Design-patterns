package StructuralPatterns.Bridge;

public abstract class Order {
    protected OrderImplementor implementor;
    protected String item;

    public Order(OrderImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void takeOrder(String item);

    public void processOrder() {
        implementor.processOrder(item);
    }
}