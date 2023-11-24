package StructuralPatterns.Bridge;

public class PhoneOrderImplementor implements OrderImplementor {
    @Override
    public void processOrder(String item) {
        System.out.println("Обробка замовлення через телефон: " + item);
    }
}