package CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Order online = factory.create("online");
        online.getOrder();

        factory.create("telephone").getOrder();
    }
}
