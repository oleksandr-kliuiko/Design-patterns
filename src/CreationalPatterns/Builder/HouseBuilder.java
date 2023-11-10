package CreationalPatterns.Builder;

public interface HouseBuilder {
    void buildTechnology();
    void buildArea();
    void BuildPrice();
    House buildResult();
}
