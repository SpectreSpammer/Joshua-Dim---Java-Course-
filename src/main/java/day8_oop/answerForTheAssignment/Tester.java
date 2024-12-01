package day8_oop.answerForTheAssignment;

public class Tester extends EmployeeAbstract implements Trainable {
    public Tester(String name, int id, double baseSalary, String department) {
        super(name, id, baseSalary,department);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 25000; // 50% of base salary
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " is attending an orientation session.");
    }
}
