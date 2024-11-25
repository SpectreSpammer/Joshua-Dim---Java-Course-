package day8_oop.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        EmployeeInheritance baseEmployee = new EmployeeInheritance(101,"joshua",50000.75);
        baseEmployee.displayEmployeeInfo();
        System.out.println();
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance(201,"Nan",60000.75,30000.75);
        fte.displayEmployeeInfo();
        System.out.println();
        PartTimeEmployeeInheritance pt = new PartTimeEmployeeInheritance(201,"Nan",60000.75,4,2500.75);
        pt.displayEmployeeInfo();
    }
}
