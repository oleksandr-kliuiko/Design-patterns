package CreationalPatterns.Prototype;

public class PrototypePattern {
    public static void main(String[] args) {
        House house = new House("panel house", 100, 50000);
        house.info();

        System.out.println();

        House clone = house.clone();
        clone.info();
    }
}
