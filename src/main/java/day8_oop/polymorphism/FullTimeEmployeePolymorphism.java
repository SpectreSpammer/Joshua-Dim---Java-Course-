package day8_oop.polymorphism;

public class FullTimeEmployeePolymorphism implements EmployeePolymorphism{

    private int id;
    private String name;
    private double baseSalary;
    private double bonus;

    public FullTimeEmployeePolymorphism(int id, String name, double baseSalary, double bonus) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
