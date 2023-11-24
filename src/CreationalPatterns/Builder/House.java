package CreationalPatterns.Builder;

public class House {
    private String technology;
    private int area;
    private int price;

    public House() {
        technology = "default";
        area = -1;
        price = -1;
    }

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
