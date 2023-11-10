package CreationalPatterns.AbstractFactory.VictorianFurniture;

import CreationalPatterns.AbstractFactory.Table;

public class VictorianTable implements Table {
    @Override
    public void printStyleTable() {
        System.out.println("Victorian table");
    }
}
