package day10_collections_framework.answerForDay9AndDay10;

public class DeveloperDay9AndDay10 extends EmployeeDay9AndDay10 {
    private int overTime;
    private double hourlyRate;

    public DeveloperDay9AndDay10(int id, String name, double baseSalary, int overTime,double hourlyRate) {
        super(id, name, baseSalary);
        this.overTime = overTime;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + ( overTime * hourlyRate);
    }
}
