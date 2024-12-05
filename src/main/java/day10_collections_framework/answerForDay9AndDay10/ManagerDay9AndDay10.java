package day10_collections_framework.answerForDay9AndDay10;

public class ManagerDay9AndDay10 extends EmployeeDay9AndDay10 {
    private double bonus;

    public ManagerDay9AndDay10(int id, String name, double baseSalary,double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
