package CreationalPatterns.FactoryMethod;

public class Factory {
    public Transport create(String type) {
        switch (type) {
            case "truck": return new Truck();
            case "ship": return new Ship();
            default: throw new RuntimeException(type + " type does not exist");
        }
    }
}
