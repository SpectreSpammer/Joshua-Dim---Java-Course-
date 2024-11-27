package day10_collections_framework.arrayListVsLinkedList.arrayList;

import java.util.ArrayList;

public class EmployeeServiceImplArrayList {
    private ArrayList<EmployeeArrayList> employees;

    public EmployeeServiceImplArrayList() {
        employees = new ArrayList<>();
    }

    //CREATE
    public void addEmployee(EmployeeArrayList employee){
        employees.add(employee);
    }

    public void addEmployeeAtIndex(int index,EmployeeArrayList employee){
        employees.add(index,employee);
    }

    //READ
    public EmployeeArrayList getEmployee(int index){
       return employees.get(index);
    }

    //UPDATE
    public void updateEmployee(int index,EmployeeArrayList updatedEmployee){
        employees.set(index,updatedEmployee);
    }

    //DELETE
    public void removeEmployee(int index){
        employees.remove(index);
    }

    //COUNT EMPLOYEES
    public int getEmployeeCount(){
        return employees.size();
    }

    public boolean isEmpty(){
        return employees.isEmpty();
    }

    public void printEmployees(){
        System.out.println("Current Employees:");
        for(EmployeeArrayList emp: employees){
            System.out.println(emp);
            System.out.println();
        }
    }
}
