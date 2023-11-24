package StructuralPatterns.Composite;

public class Composite {
    public static void main(String[] args) {
        Worker w1 = new Worker("John Doe", 2000);
        Worker w2 = new Worker("Jane Smith", 3000);

        Department development = new Department("Development");
        development.addUnit(w1);

        Department marketing = new Department("Marketing");
        marketing.addUnit(w2);

        Department company = new Department("Company");
        Worker w = new Worker("Bob", 10000000);
        company.addUnit(w);
        company.addUnit(development);
        company.addUnit(marketing);

        // Вивід інформації про всю структуру компанії
        company.display();
    }
}
