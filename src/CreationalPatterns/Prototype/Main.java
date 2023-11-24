package CreationalPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        House house = new House("panel house", 100, 50000);
        house.info();

        System.out.println();

        House clone = (House) house.clone();
        clone.info();

    }
}
