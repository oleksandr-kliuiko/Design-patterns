package CreationalPatterns.AbstractFactory.VictorianFurniture;

import CreationalPatterns.AbstractFactory.Chair;

public class VictorianChair implements Chair {
    @Override
    public void printStyleChair() {
        System.out.println("Victorian chair");
    }
}
