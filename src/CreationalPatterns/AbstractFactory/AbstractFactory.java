package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ModernFurniture.ModernFurnitureFactory;
import CreationalPatterns.AbstractFactory.VictorianFurniture.VictorianFurnitureFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        var vff = new VictorianFurnitureFactory();

        Chair victorianChair = vff.getChair();
        Table victorianTable = vff.getTable();
        Sofa victorianSofa = vff.getSofa();

        victorianChair.printStyleChair();
        victorianTable.printStyleTable();
        victorianSofa.printStyleSofa();

        System.out.println();

        var mff = new ModernFurnitureFactory();

        Chair moderChair = mff.getChair();
        Table modernTable = mff.getTable();
        Sofa moderSofa = mff.getSofa();

        moderChair.printStyleChair();
        modernTable.printStyleTable();
        moderSofa.printStyleSofa();
    }
}
