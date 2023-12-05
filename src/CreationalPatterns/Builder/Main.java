package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilderImpl();

        House brickHouse = director.constructBuilding(houseBuilder);
        brickHouse.info();
    }
}
