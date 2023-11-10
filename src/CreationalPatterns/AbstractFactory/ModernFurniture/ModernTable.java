package CreationalPatterns.AbstractFactory.ModernFurniture;

import CreationalPatterns.AbstractFactory.Table;

public class ModernTable implements Table {
    @Override
    public void printStyleTable() {
        System.out.println("Modern table");
    }
}
