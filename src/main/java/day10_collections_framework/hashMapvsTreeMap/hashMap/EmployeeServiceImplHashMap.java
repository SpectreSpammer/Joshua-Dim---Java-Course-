package day10_collections_framework.hashMapvsTreeMap.hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImplHashMap {
    private HashMap<Integer,EmployeeHashMap> employees;

    public EmployeeServiceImplHashMap() {
       employees = new HashMap<>();
    }

    //CRUD

    //create
    public void addEmployee(EmployeeHashMap employee){
        employees.put(employee.getId(), employee);
    }

    //read
    public EmployeeHashMap getEmployeeById(int id){
        return employees.get(id);
    }

    //update
    public void updateEmployeeById(int id,String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeHashMap(id,name,dept));
        }
    }

    //delete
    public EmployeeHashMap removeEmployeeById(int id){
        return employees.remove(id);
    }

    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeHashMap> entry : employees.entrySet()){
            System.out.println("Id:" + entry.getKey() +  ", Value: " + entry.getValue() );
        }
    }


    public int getEmployeeCount(){
        return  employees.size();
    }

    public boolean hasEmployeeExist(int id){
        return  employees.containsKey(id);
    }

}
