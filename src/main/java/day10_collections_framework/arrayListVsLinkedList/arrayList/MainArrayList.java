package day10_collections_framework.arrayListVsLinkedList.arrayList;

public class MainArrayList {
    public static void main(String[] args) {

        EmployeeServiceImplArrayList ems = new EmployeeServiceImplArrayList();


        ems.addEmployee(new EmployeeArrayList(101,"Joshua","IT"));
        ems.addEmployee(new EmployeeArrayList(102,"Nan","PR"));
        ems.addEmployee(new EmployeeArrayList(103,"Nami","HR"));
        ems.addEmployee(new EmployeeArrayList(104,"Robin","Sales"));

        System.out.println("After Adding Employees");
        ems.printEmployees();
        System.out.println();
        ems.updateEmployee(0,new EmployeeArrayList(101,"Josh","Backend Developer"));
        ems.printEmployees();
        System.out.println();
        ems.removeEmployee(2);
        ems.printEmployees();

        System.out.println("Total Employees: " + ems.getEmployeeCount());
        System.out.println("Is the list empty: " + ems.isEmpty());
        System.out.println("Employee index at 1: " + ems.getEmployee(1));


    }
}
