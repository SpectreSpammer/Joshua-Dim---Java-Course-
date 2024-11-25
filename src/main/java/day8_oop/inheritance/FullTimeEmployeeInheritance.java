package day8_oop.inheritance;

public class FullTimeEmployeeInheritance extends EmployeeInheritance{
    private double bonus;

    public FullTimeEmployeeInheritance(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.salary + bonus;
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus);

    }
}
