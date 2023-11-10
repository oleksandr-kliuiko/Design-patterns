package CreationalPatterns.Builder;

public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();

        House brickHouse = director.constructBuilding(brickHouseBuilder);
        brickHouse.info();

        System.out.println();

        HouseBuilder panelHouseBuilder = new PanelHouseBuilder();
        House panelHouse = director.constructBuilding(panelHouseBuilder);
        panelHouse.info();
    }
}
