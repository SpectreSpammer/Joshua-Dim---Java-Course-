package day6_arrays.accessingAndModifying;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        String[] employeeName = {"Joshua","Nan","Nami","Robin"};
        double [] salary = {50000,60000,70000,80000};
        int[] yearsOfService = {7,2,11,8};
        boolean[] isLate = {false,true,true,false};
        int [] hoursOfWork = {35,40,55,45};

        //Printing all of the elements
        System.out.println(" -- Employee Data");
        for(int i = 0; i < employeeName.length; i++){
            System.out.println("Employee name: " + employeeName[i]);
            System.out.println("Employee salary: " + salary[i]);
            System.out.println("Hours of Worked: " + hoursOfWork[i]);
            System.out.println();
        }

        //Modifying of array elements

        System.out.println(" 1. Applying 10% raise to all employee with more than 40 hrs of worked");
        for(int i = 0; i < hoursOfWork.length; i++){
            if(hoursOfWork[i] > 40){
                double originalSalary = salary[i];
                salary[i] *= 1.30;
                System.out.printf(" - %s received a 10%% raise. Original Salary: Php %.2f, New Salary: Php %.2f %n",
                                    employeeName[i],originalSalary, salary[i]);
            }
        }

        System.out.println();
        System.out.println(" 2. Applying Salary deductions of 10% for late employees ");
        for(int i = 0; i < employeeName.length; i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] *= 0.90;
                System.out.printf(" - %s was late. Original Salary: Php %.2f, New Salary: Php %.2f %n",
                        employeeName[i],originalSalary, salary[i]);
            }
        }

        System.out.println();
        System.out.println(" 3. Updating hours of worked for specific employee");
        int employeeIndex = 2;
        hoursOfWork[employeeIndex] = 40;
        System.out.println(employeeName[employeeIndex] + "`s hours updated to: " + hoursOfWork[employeeIndex]);

        System.out.println(" -- Updated Employee Data");
        for(int i = 0; i < employeeName.length; i++){
            System.out.println("Employee name: " + employeeName[i]);
            System.out.println("Employee salary: " + salary[i]);
            System.out.println("Hours of Worked: " + hoursOfWork[i]);
            System.out.println();
        }

    }
}
