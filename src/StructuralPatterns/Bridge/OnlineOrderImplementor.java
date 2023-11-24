package StructuralPatterns.Bridge;

public class OnlineOrderImplementor implements OrderImplementor {
    @Override
    public void processOrder(String item) {
        System.out.println("Обробка замовлення через онлайн-форму: " + item);
    }
}