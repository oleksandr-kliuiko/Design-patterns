package CreationalPatterns.AbstractFactory.ModernFurniture;

import CreationalPatterns.AbstractFactory.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void printStyleSofa() {
        System.out.println("Modern sofa");
    }
}
