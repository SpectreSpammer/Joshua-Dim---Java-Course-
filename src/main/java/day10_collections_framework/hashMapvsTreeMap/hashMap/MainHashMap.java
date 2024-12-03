package day10_collections_framework.hashMapvsTreeMap.hashMap;

public class MainHashMap {

    public static void main(String[] args) {
        EmployeeServiceImplHashMap emp = new EmployeeServiceImplHashMap();

        //
        emp.addEmployee(new EmployeeHashMap(1,"Joshua","IT"));
        emp.addEmployee(new EmployeeHashMap(4,"Nan","IT"));
        emp.addEmployee(new EmployeeHashMap(5,"Nami","IT"));
        emp.addEmployee(new EmployeeHashMap(3,"Robin","IT"));
        emp.addEmployee(new EmployeeHashMap(2,"Luffy","IT"));

        System.out.println("Display All Employees");
        emp.displayAllEmployees();
        System.out.println();
        int searchEmployeeId = 5;
        EmployeeHashMap emps = emp.getEmployeeById(searchEmployeeId);
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
    }

}
