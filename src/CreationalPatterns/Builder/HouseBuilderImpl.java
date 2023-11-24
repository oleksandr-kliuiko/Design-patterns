package CreationalPatterns.Builder;

public class HouseBuilderImpl implements HouseBuilder {
    private House house = new House();

    @Override
    public HouseBuilder buildTechnology(String technology) {
        house.setTechnology(technology);
        return this;
    }

    @Override
    public HouseBuilder buildArea(int area) {
        house.setArea(area);
        return this;
    }

    @Override
    public HouseBuilder buildPrice(int price) {
        house.setPrice(price);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
