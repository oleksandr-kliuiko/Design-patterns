package CreationalPatterns.Builder;

public class House {
    private String technology;
    private int area;
    private int price;

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void info() {
        System.out.println("technology: " + technology + "\narea: " + area + "\nprice: " + price);
    }
}
