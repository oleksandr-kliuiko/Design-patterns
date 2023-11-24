package CreationalPatterns.AbstractFactory.Samsung;

import CreationalPatterns.AbstractFactory.Interfaces.Cover;

public class SiliconeCase implements Cover {
    @Override
    public void printCover() {
        System.out.println("Silicone case");
    }
}
