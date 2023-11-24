package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder brickHouseBuilder = new HouseBuilderImpl();

        House brickHouse = director.constructBuilding(brickHouseBuilder);
        brickHouse.info();
    }
}
