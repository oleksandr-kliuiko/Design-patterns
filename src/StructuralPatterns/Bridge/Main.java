package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        OrderImplementor phoneOrderImplementor = new PhoneOrderImplementor();
        OrderImplementor onlineOrderImplementor = new OnlineOrderImplementor();

        Order phoneOrder = new PhoneOrder(phoneOrderImplementor);
        Order onlineOrder = new OnlineOrder(onlineOrderImplementor);

        phoneOrder.takeOrder("Піца");
        phoneOrder.processOrder();

        System.out.println("-------------------");

        onlineOrder.takeOrder("Салат");
        onlineOrder.processOrder();
    }
}
