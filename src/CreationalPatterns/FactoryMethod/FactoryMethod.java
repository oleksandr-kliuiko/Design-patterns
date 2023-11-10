package CreationalPatterns.FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Transport ship = factory.create("ship");
        ship.delivery();

        factory.create("truck").delivery();

        factory.create("plain").delivery();
    }
}
