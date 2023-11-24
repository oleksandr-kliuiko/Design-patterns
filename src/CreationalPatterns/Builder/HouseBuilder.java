package CreationalPatterns.Builder;

public interface HouseBuilder {
    HouseBuilder buildTechnology(String technology);
    HouseBuilder buildArea(int area);
    HouseBuilder buildPrice(int price);
    House build();
}
