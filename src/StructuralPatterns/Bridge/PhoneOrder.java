package StructuralPatterns.Bridge;

public class PhoneOrder extends Order {
    public PhoneOrder(OrderImplementor implementor) {
        super(implementor);
    }

    @Override
    public void takeOrder(String item) {
        this.item = item;
        System.out.println("Замовлення через телефон: " + item);
    }
}