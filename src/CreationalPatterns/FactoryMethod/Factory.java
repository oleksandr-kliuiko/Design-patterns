package CreationalPatterns.FactoryMethod;

public class Factory {
    public Order create(String type) {
        switch (type) {
            case "telephone": return new TelephoneOrder();
            case "online": return new OnlineOrder();
            default: throw new RuntimeException(type + " type does not exist");
        }
    }
}
