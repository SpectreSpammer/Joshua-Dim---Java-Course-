package day10_collections_framework.arrayListVsLinkedList.linkedList;

import java.util.LinkedList;

public class EmployeeServiceImplLinkedList {
    private LinkedList<EmployeeLinkedList> employees;

    public EmployeeServiceImplLinkedList() {
        employees = new LinkedList<>();
    }

    //CRUD

    //add objects
    public void addEmployee(EmployeeLinkedList employee){
        employees.add(employee);
    }

    //add objects in the front
    public void addEmployeeToFront(EmployeeLinkedList employee){
        employees.addFirst(employee);
    }

    //add objects in the last
    public void addEmployeeToLast(EmployeeLinkedList employee){
        employees.addLast(employee);
    }

    public EmployeeLinkedList getFirstEmployee(){
        return employees.getFirst();
    }

    public EmployeeLinkedList getLastEmployee(){
        return employees.getLast();
    }

    public EmployeeLinkedList removeFirstEmployee(){
        return employees.removeFirst();
    }

    public EmployeeLinkedList removeLastEmployee(){
        return employees.removeLast();
    }

    public void printAllEmployees(){
        System.out.println("Current Employee");
        for(EmployeeLinkedList emp : employees){
            System.out.println(emp);
        }
    }


}
