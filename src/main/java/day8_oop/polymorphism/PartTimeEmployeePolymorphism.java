package day8_oop.polymorphism;

public class PartTimeEmployeePolymorphism implements EmployeePolymorphism{

    private int id;
    private String name;
    private double baseSalary;
    private int workingHours;
    private double overTimePay;

    public PartTimeEmployeePolymorphism(int id, String name, double baseSalary, int workingHours, double overTimePay) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.overTimePay = overTimePay;
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
        return baseSalary + (overTimePay * workingHours);
    }
}
