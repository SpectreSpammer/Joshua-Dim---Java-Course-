package day10_collections_framework.hashSetvsTreeSet.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceImplTreeSet {
    private static TreeSet<EmployeeTreeSet> employees;

    public EmployeeServiceImplTreeSet() {
       employees = new TreeSet<>();
    }

    public EmployeeServiceImplTreeSet(Comparator<EmployeeTreeSet> comparator) {
        employees = new TreeSet<>(comparator);
    }

    public boolean addEmployee(EmployeeTreeSet employeeTreeSet){
        return employees.add(employeeTreeSet);
    }

    public boolean removeEmployee(EmployeeTreeSet employeeTreeSet){
        return employees.remove(employeeTreeSet);
    }

    public static void printEmployee(){
        System.out.println("Current employees (sorted)");
        for(EmployeeTreeSet emp : employees){
            System.out.println(emp);
        }
    }

    public EmployeeTreeSet getFirstEmployee(){
        return  employees.first();
    }

    public EmployeeTreeSet getLastEmployee(){
        return  employees.last();
    }




}
