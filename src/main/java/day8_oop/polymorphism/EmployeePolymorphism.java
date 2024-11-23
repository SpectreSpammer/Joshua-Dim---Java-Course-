package day8_oop.polymorphism;

public interface EmployeePolymorphism {
    int  getId();
    String getName();
    double getSalary();
    double calculateSalary();

     default void displayInfo(){
         System.out.println("Employee Id: " + getId());
         System.out.println("Employee Name: " + getName());
         System.out.println("Salary: " + calculateSalary());
    }
}
