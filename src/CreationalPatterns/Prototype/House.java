package CreationalPatterns.Prototype;

public class House implements Prototype {
    private String technology;
    private int area;
    private int price;

    public House(String technology, int area, int price) {
        this.technology = technology;
        this.area = area;
        this.price = price;
    }

    public void info() {
        System.out.println("technology: " + technology + "\narea: " + area + "\nprice: " + price);
    }

    @Override
    public House clone() {
        return new House(technology, area, price);
    }
}
