package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Samsung.SamsungKit;

public class Main {
    public static void main(String[] args) {
        SamsungKit factory = new SamsungKit();

        factory.getPhone().printModel();
        factory.getCable().printCable();
        factory.getCover().printCover();
    }
}
