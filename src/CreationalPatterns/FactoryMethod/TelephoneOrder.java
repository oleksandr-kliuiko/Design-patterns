package CreationalPatterns.FactoryMethod;

public class TelephoneOrder implements Order {

    @Override
    public void getOrder() {
        System.out.println("Отримано замовлення по телефону");
    }
}
