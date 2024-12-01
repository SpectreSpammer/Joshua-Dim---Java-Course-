package day8_oop.answerForTheAssignment;

public abstract class EmployeeAbstract {
    protected String name;
    protected final int id;
    protected double baseSalary;
    protected String department;

    public EmployeeAbstract(String name, int id, double baseSalary, String department) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayInfo() {
        System.out.println("Name: " + name +
                ", ID: " + id +
                ", Department: " + department + ", " +
                "Salary: Php " + calculateSalary());
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
