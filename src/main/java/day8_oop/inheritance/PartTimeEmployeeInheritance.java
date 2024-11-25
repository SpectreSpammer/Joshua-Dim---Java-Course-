package day8_oop.inheritance;

public class PartTimeEmployeeInheritance extends EmployeeInheritance{
    private int hoursWorked;
    private double overtimepay;

    public PartTimeEmployeeInheritance(int id, String name, double salary,int hoursWorked, double overtimepay) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.overtimepay = overtimepay;
    }

    @Override
    public double calculateSalary() {
        return super.salary + (overtimepay * hoursWorked);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Over time pay: " + overtimepay);

    }
}
