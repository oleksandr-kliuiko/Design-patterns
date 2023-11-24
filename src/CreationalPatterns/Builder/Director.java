package CreationalPatterns.Builder;

public class Director {
        public House constructBuilding(HouseBuilder builder) {
            builder.buildTechnology("Brick");
            builder.buildArea(222);
            builder.buildPrice(142534);
            return builder.build();
        }
}
