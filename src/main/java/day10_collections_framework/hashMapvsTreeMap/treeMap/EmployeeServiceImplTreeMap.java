package day10_collections_framework.hashMapvsTreeMap.treeMap;

import day10_collections_framework.hashMapvsTreeMap.hashMap.EmployeeHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceImplTreeMap {
    private TreeMap<Integer, EmployeeTreeMap> employees;

    public EmployeeServiceImplTreeMap() {
        employees = new TreeMap<>();
    }

    //CRUD

    //create
    public void addEmployee(EmployeeTreeMap employee){
        employees.put(employee.getId(), employee);
    }

    //read
    public EmployeeTreeMap getEmployeeById(int id){
        return employees.get(id);
    }

    //update
    public void updateEmployeeById(int id,String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeTreeMap(id,name,dept));
        }
    }

    //delete
    public EmployeeTreeMap removeEmployeeById(int id){
        return employees.remove(id);
    }

    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeTreeMap> entry : employees.entrySet()){
            System.out.println("Id:" + entry.getKey() +  ", Value: " + entry.getValue() );
        }
    }

    public int getEmployeeCount(){
        return  employees.size();
    }

    public boolean hasEmployeeExist(int id){
        return  employees.containsKey(id);
    }

    public EmployeeTreeMap getFirstEmployee(){
        return  employees.firstEntry().getValue();
    }

    public EmployeeTreeMap getLastEmployee(){
        return  employees.lastEntry().getValue();
    }
}
