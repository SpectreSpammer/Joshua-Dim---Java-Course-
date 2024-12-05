package day10_collections_framework.answerForDay9AndDay10;

import java.util.*;

public class EmployeeServiceImplDay9AndDay10 {
    private Map<Integer, EmployeeDay9AndDay10> employeeMap;
    private Set<EmployeeDay9AndDay10> employeeSet;
    private List<EmployeeDay9AndDay10> employeeList;

    public EmployeeServiceImplDay9AndDay10(boolean useTreeMap, boolean useTreeSet, boolean useLinkedList) {
        employeeMap = useTreeMap ? new TreeMap<>() : new HashMap<>();
        employeeSet = useTreeSet ? new TreeSet<>(Comparator.comparingInt(EmployeeDay9AndDay10::getId)) : new HashSet<>();
        employeeList = useLinkedList ? new LinkedList<>() : new ArrayList<>();
    }

    public void addEmployee(EmployeeDay9AndDay10 employee) {
        employeeMap.put(employee.getId(), employee);
        employeeSet.add(employee);
        employeeList.add(employee);
    }

    public EmployeeDay9AndDay10 getEmployee(int id) throws EmployeeDay9AndDay10NotFoundException {
        EmployeeDay9AndDay10 employee = employeeMap.get(id);
        if (employee == null) {
            throw new EmployeeDay9AndDay10NotFoundException("Employee with ID " + id + " not found.");
        }
        return employee;
    }

    public void removeEmployee(int id) throws EmployeeDay9AndDay10NotFoundException {
        EmployeeDay9AndDay10 employee = getEmployee(id);
        employeeMap.remove(id);
        employeeSet.remove(employee);
        employeeList.remove(employee);
    }

    public void displayAllEmployees() {
        System.out.println("Employees in Map:");
        for (EmployeeDay9AndDay10 emp : employeeMap.values()) {
            System.out.println(emp);
        }

        System.out.println("\nEmployees in Set:");
        for (EmployeeDay9AndDay10 emp : employeeSet) {
            System.out.println(emp);
        }

        System.out.println("\nEmployees in List:");
        for (EmployeeDay9AndDay10 emp : employeeList) {
            System.out.println(emp);
        }
    }

    public double calculateTotalPayroll() {
        return employeeList.stream().mapToDouble(EmployeeDay9AndDay10::calculateSalary).sum();
    }
}
