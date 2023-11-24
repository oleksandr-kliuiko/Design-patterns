package StructuralPatterns.Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private Map<String, ColorFlyweight> colors = new HashMap<>();

    // Метод для отримання легковагового об'єкта
    public ColorFlyweight getColor(String name, Color color) {
        if (!colors.containsKey(name)) {
            colors.put(name, new ColorFlyweight(name, color));
        }
        return colors.get(name);
    }
}
