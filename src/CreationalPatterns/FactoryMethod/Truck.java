package CreationalPatterns.FactoryMethod;

public class Truck implements Transport {

    @Override
    public void delivery() {
        System.out.println("Наземні перевезення");
    }
}
