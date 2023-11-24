package CreationalPatterns.AbstractFactory.Samsung;

import CreationalPatterns.AbstractFactory.Interfaces.Cable;

public class UsbTypeC implements Cable {
    @Override
    public void printCable() {
        System.out.println("USB Type-C");
    }
}
