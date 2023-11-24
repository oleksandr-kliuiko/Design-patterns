package CreationalPatterns.FactoryMethod;

public class OnlineOrder implements Order {
    @Override
    public void getOrder() {
        System.out.println("Отримано онлайн замовлення");
    }
}
