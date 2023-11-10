package CreationalPatterns.AbstractFactory.VictorianFurniture;

import CreationalPatterns.AbstractFactory.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void printStyleSofa() {
        System.out.println("Victorian sofa");
    }
}
