package CreationalPatterns.AbstractFactory.ModernFurniture;

import CreationalPatterns.AbstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public void printStyleChair() {
        System.out.println("Modern chair");
    }
}
