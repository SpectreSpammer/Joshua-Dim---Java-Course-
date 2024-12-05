package day10_collections_framework.answerForDay9AndDay10;

public class MainDay9AndDay10 {
    public static void main(String[] args) {
        EmployeeServiceImplDay9AndDay10 ems = new EmployeeServiceImplDay9AndDay10(true, true, true);

        try {
            ems.addEmployee(new ManagerDay9AndDay10(1, "John Doe", 5000, 1000));
            ems.addEmployee(new DeveloperDay9AndDay10(2, "Jane Smith", 4000, 10, 50));
            ems.addEmployee(new ManagerDay9AndDay10(2, "John Doe", 5000, 1000));
            ems.addEmployee(new DeveloperDay9AndDay10(4, "Alice Brown", 4200, 15, 45));

            System.out.println("All Employees:");
            ems.displayAllEmployees();

            System.out.println("\nTotal Payroll: $" + ems.calculateTotalPayroll());

            System.out.println("\nRemoving employee with ID 2");
            ems.removeEmployee(2);

            System.out.println("\nUpdated Employee List:");
            ems.displayAllEmployees();

            System.out.println("\nTrying to get employee with ID 2");
            ems.getEmployee(2);
        } catch (EmployeeDay9AndDay10NotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
