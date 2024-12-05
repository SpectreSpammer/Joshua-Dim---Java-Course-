package day10_collections_framework.answerForDay9AndDay10;

import java.util.Objects;

public  abstract class EmployeeDay9AndDay10 {
    protected int id;
    protected String name;
    protected double baseSalary;

    public EmployeeDay9AndDay10(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', baseSalary=" + baseSalary + "}";
    }

    // For use in HashSet and HashMap

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDay9AndDay10 that = (EmployeeDay9AndDay10) o;
        return id == that.id && Double.compare(baseSalary, that.baseSalary) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, baseSalary);
    }
}
