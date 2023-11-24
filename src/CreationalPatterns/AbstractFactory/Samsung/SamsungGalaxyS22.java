package CreationalPatterns.AbstractFactory.Samsung;

import CreationalPatterns.AbstractFactory.Interfaces.Phone;

public class SamsungGalaxyS22 implements Phone {
    @Override
    public void printModel() {
        System.out.println("Samsung Galaxy S22");
    }
}
