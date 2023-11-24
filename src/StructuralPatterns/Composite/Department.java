package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements CompanyUnit {
    private String name;
    private List<CompanyUnit> units;

    public Department(String name) {
        this.name = name;
        units = new ArrayList<>();
    }

    public void addUnit(CompanyUnit unit) {
        units.add(unit);
    }

    @Override
    public void display() {
        System.out.println("Department: " + name);
        for(CompanyUnit u : units) {
            u.display();
        }
    }
}
