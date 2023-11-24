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
    public Prototype clone() {
        return new House(this.technology, this.area, this.price);
    }
}
