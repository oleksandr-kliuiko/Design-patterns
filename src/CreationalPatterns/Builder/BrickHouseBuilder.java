package CreationalPatterns.Builder;

public class BrickHouseBuilder implements HouseBuilder {
    private House house = new House();
    @Override
    public void buildTechnology() {
        house.setTechnology("brick house");
    }

    @Override
    public void buildArea() {
        house.setArea(100);
    }

    @Override
    public void BuildPrice() {
        house.setPrice(50_000);
    }

    @Override
    public House buildResult() {
        return house;
    }
}
