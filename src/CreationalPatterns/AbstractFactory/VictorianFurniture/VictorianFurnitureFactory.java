package CreationalPatterns.AbstractFactory.VictorianFurniture;

import CreationalPatterns.AbstractFactory.Chair;
import CreationalPatterns.AbstractFactory.FurnitureSetFactory;
import CreationalPatterns.AbstractFactory.Sofa;
import CreationalPatterns.AbstractFactory.Table;

public class VictorianFurnitureFactory implements FurnitureSetFactory {
    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Table getTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }
}
