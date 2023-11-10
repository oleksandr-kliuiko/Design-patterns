package CreationalPatterns.FactoryMethod;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("Морські перевезення");
    }
}
