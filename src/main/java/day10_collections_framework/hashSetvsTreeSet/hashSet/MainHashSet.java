package day10_collections_framework.hashSetvsTreeSet.hashSet;

public class MainHashSet {
    public static void main(String[] args) {

        EmployeeServiceImplHashSet ems = new EmployeeServiceImplHashSet();

        EmployeeHashSet emp5 = new EmployeeHashSet(5,"Josh","IT");
        EmployeeHashSet emp2 = new EmployeeHashSet(2,"Nan","Finance");
        EmployeeHashSet emp4 = new EmployeeHashSet(4,"Nami","HR");
        EmployeeHashSet emp3 = new EmployeeHashSet(3,"Robin","PR");
        EmployeeHashSet emp1 = new EmployeeHashSet(1,"Zorro","Security");

        System.out.println("Adding Employees");
        System.out.println("Added emp1:" + ems.addEmployee(emp2));
        System.out.println("Added emp2:" + ems.addEmployee(emp2));
        System.out.println("Added emp3:" + ems.addEmployee(emp3));
        System.out.println("Added emp4:" + ems.addEmployee(emp4));
        System.out.println("Added emp5:" + ems.addEmployee(emp5));
        System.out.println();
        ems.printEmployees();

        System.out.println("Employee count: " + ems.getEmployeeCount());

        System.out.println("Checking if the employee exist");
        System.out.println("Contains emp2:" + ems.containsEmployee(emp2));

        System.out.println("Removing emp2: " );
        System.out.println("Removed emp2: " + ems.removeEmployee(emp2));
        ems.printEmployees();
    }
}
