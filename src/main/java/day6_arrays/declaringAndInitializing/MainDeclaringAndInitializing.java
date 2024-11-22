package day6_arrays.declaringAndInitializing;

import java.util.Arrays;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {
        //data type [] variable name = { };
        String[] employeeName = {"Joshua","Nan","Nami","Robin"};
        double [] salary = {50000,60000,70000,80000};


        System.out.println("Employee names:" + Arrays.toString(employeeName));
        System.out.println("Employee Salaries:" + Arrays.toString(salary));
        System.out.println();
        System.out.println("List of employee names");
        for (String empName : employeeName){
            System.out.println(" - " + empName);
        }
        System.out.println();
        System.out.println("List of employee names");
        for (double baseSalary : salary){
            System.out.println(" - " + baseSalary);
        }



    }
}
