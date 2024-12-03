package day10_collections_framework.hashMapvsTreeMap.treeMap;

import day10_collections_framework.hashMapvsTreeMap.hashMap.EmployeeHashMap;
import day10_collections_framework.hashMapvsTreeMap.hashMap.EmployeeServiceImplHashMap;

public class MainTreeMap {
    public static void main(String[] args) {
        EmployeeServiceImplTreeMap emp = new EmployeeServiceImplTreeMap();

        //
        emp.addEmployee(new EmployeeTreeMap(2,"Joshua","IT"));
        emp.addEmployee(new EmployeeTreeMap(4,"Nan","HR"));
        emp.addEmployee(new EmployeeTreeMap(5,"Nami","PR"));
        emp.addEmployee(new EmployeeTreeMap(3,"Robin","Finance"));
        emp.addEmployee(new EmployeeTreeMap(1,"Luffy","Security"));

        System.out.println("Display All Employees");
        emp.displayAllEmployees();


        System.out.println();
        int searchEmployeeId = 5;
        EmployeeTreeMap emps = emp.getEmployeeById(searchEmployeeId);
        System.out.println("Employee with an Id " + searchEmployeeId + ": " + emps);

        System.out.println();
        emp.updateEmployeeById(2,"Luffy", "HR");
        System.out.println("After updating employee");
        emp.displayAllEmployees();
        System.out.println();

        int removeById = 5;
        emp.removeEmployeeById(removeById);
        System.out.println("Remove Employee with an Id " + removeById);
        System.out.println("After deleting employee");
        emp.displayAllEmployees();


        int checkId = 5;
        System.out.println("Employee number: " + checkId + " exist? " + emp.hasEmployeeExist(checkId));

        System.out.println("Total number of employees: " + emp.getEmployeeCount());


        System.out.println("First employee: " + emp.getFirstEmployee());
        System.out.println("Last employee: " + emp.getLastEmployee());
    }
}
