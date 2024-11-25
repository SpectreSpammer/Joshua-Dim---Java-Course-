package day8_oop.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        EmployeeEncapsulation emp = new EmployeeEncapsulation(101,"Joshua",50000.75);
        System.out.println(emp);

        System.out.println();

        emp.setSalary(-20000.75);
        System.out.println();
        emp.setSalary(20000.75);
        System.out.println(emp);
    }
}
