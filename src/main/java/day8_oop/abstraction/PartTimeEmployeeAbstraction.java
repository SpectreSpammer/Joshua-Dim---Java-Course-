package day8_oop.abstraction;

public class PartTimeEmployeeAbstraction extends EmployeeAbstraction{

    private double overtimepay;
    private int hoursWorked;

    public PartTimeEmployeeAbstraction(
            int id, String name, double salary,int hoursWorked,double overtimepay) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.overtimepay = overtimepay;
    }

    @Override
    public double calculateSalary() {
       return salary + (overtimepay * hoursWorked);
    }
}
