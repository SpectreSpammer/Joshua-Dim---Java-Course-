package day5_control_flow.loopStatement;

public class ForLoop {
    public static void main(String[] args) {
        String[] employeeName = {"Josh","Nan","Nami","Robin"};
        double[] salary = {50000,60000,70000,80000};
        String dept[] = {"IT","admin","PR","Sales"};
        int[] yearsOfService = {5,6,3,8};

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
    }
}
