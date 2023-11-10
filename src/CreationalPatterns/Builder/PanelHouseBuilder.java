package CreationalPatterns.Builder;

public class PanelHouseBuilder implements HouseBuilder{
    private House house = new House();
    @Override
    public void buildTechnology() {
        house.setTechnology("panel house");
    }

    @Override
    public void buildArea() {
        house.setArea(200);
    }

    @Override
    public void BuildPrice() {
        house.setPrice(100_000);
    }

    @Override
    public House buildResult() {
        return house;
    }
}
