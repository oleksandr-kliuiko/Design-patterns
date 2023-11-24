package StructuralPatterns.Composite;

public class Worker implements CompanyUnit {
    private String name;
    private int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + "\tsalary: " + salary);
    }
}
