package CreationalPatterns.AbstractFactory;

public interface FurnitureSetFactory {
    Chair getChair();
    Table getTable();
    Sofa getSofa();
}
