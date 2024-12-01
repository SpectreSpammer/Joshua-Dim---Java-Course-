package day10_collections_framework.arrayListVsLinkedList.linkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        EmployeeServiceImplLinkedList ems = new EmployeeServiceImplLinkedList();

        ems.addEmployee(new EmployeeLinkedList(1,"Joshua","IT"));
        ems.addEmployee(new EmployeeLinkedList(2,"Nan","Sales"));
        ems.addEmployeeToFront(new EmployeeLinkedList(3,"Nami","HR"));
        ems.addEmployeeToLast(new EmployeeLinkedList(4,"Robin","PR"));
        ems.addEmployee(new EmployeeLinkedList(5,"Sanji","Kitchen"));
        System.out.println("After adding employees");
        ems.printAllEmployees();

        System.out.println();
        System.out.println("First Employee: " + ems.getFirstEmployee());
        System.out.println("Last Employee: " + ems.getLastEmployee());

        System.out.println();
        System.out.println("Remove first employee: " + ems.removeFirstEmployee());
        System.out.println("Remove last employee: " + ems.removeLastEmployee());
        System.out.println();
        ems.printAllEmployees();



    }
}
