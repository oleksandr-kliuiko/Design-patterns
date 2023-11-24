package StructuralPatterns.Flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();

        ColorFlyweight red = colorFactory.getColor("Red", Color.RED);
        red.applyColor();

        ColorFlyweight blue = colorFactory.getColor("Blue", Color.BLUE);
        blue.applyColor();

    }
}
