package CreationalPatterns.AbstractFactory.ModernFurniture;

import CreationalPatterns.AbstractFactory.Chair;
import CreationalPatterns.AbstractFactory.FurnitureSetFactory;
import CreationalPatterns.AbstractFactory.Sofa;
import CreationalPatterns.AbstractFactory.Table;

public class ModernFurnitureFactory implements FurnitureSetFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
