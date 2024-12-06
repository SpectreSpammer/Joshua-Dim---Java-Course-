package day10_collections_framework.hashSetvsTreeSet.treeSet;

import day10_collections_framework.hashSetvsTreeSet.hashSet.EmployeeServiceImplHashSet;

import java.util.Comparator;

public class MainTreeSet {
    public static void main(String[] args) {

        EmployeeServiceImplTreeSet employee = new EmployeeServiceImplTreeSet();

        employee.addEmployee(new EmployeeTreeSet( 2,"Joshua","IT"));
        employee.addEmployee(new EmployeeTreeSet( 4,"Nan","Accounting"));
        employee.addEmployee(new EmployeeTreeSet( 1,"Nami","HR"));
        employee.addEmployee(new EmployeeTreeSet( 3,"Robin","Finance"));
        employee.addEmployee(new EmployeeTreeSet( 5,"Zorro","Security"));
        System.out.println("Employees sorted by Id:");
        EmployeeServiceImplTreeSet.printEmployee();
        System.out.println();

        EmployeeServiceImplTreeSet empByName = new EmployeeServiceImplTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );

        empByName.addEmployee(new EmployeeTreeSet(2,"Joshua","IT"));
        empByName.addEmployee(new EmployeeTreeSet(4,"Nan","Accounting"));
        empByName.addEmployee(new EmployeeTreeSet(1,"Nami","HR"));
        empByName.addEmployee(new EmployeeTreeSet(3,"Robin","Finance"));
        empByName.addEmployee(new EmployeeTreeSet(5,"Zorro","Security"));
        System.out.println("Employees sorted by Name:");
        empByName.printEmployee();
        System.out.println();

        EmployeeServiceImplTreeSet empByDept = new EmployeeServiceImplTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDept)
        );

        empByDept.addEmployee(new EmployeeTreeSet(2,"Joshua","IT"));
        empByDept.addEmployee(new EmployeeTreeSet(4,"Nan","Accounting"));
        empByDept.addEmployee(new EmployeeTreeSet(1,"Nami","HR"));
        empByDept.addEmployee(new EmployeeTreeSet(3,"Robin","Finance"));
        empByDept.addEmployee(new EmployeeTreeSet(5,"Zorro","Security"));
        System.out.println("Employees sorted by Name:");
        empByDept.printEmployee();
    }
}
