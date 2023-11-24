package StructuralPatterns.Flyweight;

import java.awt.*;

public class ColorFlyweight implements IColor {
    private String name;
    private Color color;

    public ColorFlyweight(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    @Override
    public void applyColor() {
        System.out.println("Selected color: " + name);
    }
}
