package CreationalPatterns.Builder;

public class Director {
        public House constructBuilding(HouseBuilder builder) {
            builder.buildTechnology();
            builder.buildArea();
            builder.BuildPrice();
            return builder.buildResult();
        }
}
