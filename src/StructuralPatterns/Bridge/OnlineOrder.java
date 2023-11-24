package StructuralPatterns.Bridge;

public class OnlineOrder extends Order {
    public OnlineOrder(OrderImplementor implementor) {
        super(implementor);
    }

    @Override
    public void takeOrder(String item) {
        this.item = item;
        System.out.println("Замовлення через онлайн-форму: " + item);
    }
}