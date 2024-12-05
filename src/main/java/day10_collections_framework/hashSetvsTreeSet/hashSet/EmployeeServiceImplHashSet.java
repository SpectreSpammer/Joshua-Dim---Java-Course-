package day10_collections_framework.hashSetvsTreeSet.hashSet;

import java.util.HashSet;

public class EmployeeServiceImplHashSet {

    private HashSet<EmployeeHashSet> employees;

    public EmployeeServiceImplHashSet() {
        this.employees = new HashSet<>();
    }

    public boolean addEmployee(EmployeeHashSet employeeHashSet){
        return employees.add(employeeHashSet);
    }

    public boolean removeEmployee(EmployeeHashSet employeeHashSet){
        return employees.remove(employeeHashSet);
    }

    public boolean containsEmployee(EmployeeHashSet employeeHashSet){
        return employees.contains(employeeHashSet);
    }


    public void printEmployees(){
        System.out.println("Current Employees:");
        for(EmployeeHashSet emp : employees){
            System.out.println(emp);
        }
    }


    public int getEmployeeCount(){
        return employees.size();
    }
}
