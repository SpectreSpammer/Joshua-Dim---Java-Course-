package day9_exceptions.customizedException;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) throws InvalidRaiseException{
        if(percentage < 0 || percentage > 100){
            throw new InvalidRaiseException("Invalid raise percentage. Must be between 0 to 100.");
        }
        this.salary += this.salary * (percentage/100);
    }


}
