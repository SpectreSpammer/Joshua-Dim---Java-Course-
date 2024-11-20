package day5_control_flow.loopStatement;

import java.util.ArrayList;
import java.util.List;

public class MainForEach {
    public static void main(String[] args) {

        String[] employeeName = {"Josh","Nan","Nami","Robin"};
        double[] salary = {50000,60000,70000,80000};
        String dept[] = {"IT","admin","PR","Sales"};
        int[] yearsOfService = {5,6,3,8};
        Object[] employeeDetails = {"Josh",29,"NCR",false,50000,20000.75};
        List<Object> emp = new ArrayList<>();
        emp.add("Josh");
        emp.add(false);

        for(int i = 0;i < employeeName.length;i++){
            String name = employeeName[i];
            Double baseSalary = salary[i];
            String depart = dept[i];
            int yrs = yearsOfService[i];
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + baseSalary);
            System.out.println("Employee Dept: " + depart);
            System.out.println("Employee Years of Service: " + yrs);
            System.out.println();
        }

        for(String name : employeeName){
            System.out.println(" --" + name);
        }

        for(String depart : dept){
            System.out.println(" --" + depart);
        }
    }
}
