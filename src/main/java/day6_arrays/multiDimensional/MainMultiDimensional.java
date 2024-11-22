package day6_arrays.multiDimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {


        //name, salary, hoursWorked,yearsOfService,isLate
        Object[][] employeeData = {
                {"Joshua",50000.75,40,6,true},
                {"Nan",60000.75,45,3,false},
                {"Nami",70000.75,30,4,true},
                {"Robin",80000.75,50,11,false}
        };

        System.out.println(" -- Initial Employee Data");
        displayEmployeeInfo(employeeData);
        System.out.println();

        System.out.println(" 1. Applying 10% raise to all employee with more than 40 hrs of worked");
        for(int i = 0; i < employeeData.length; i++){
            if((int)employeeData[i][2] > 40){
                double originalSalary = (double) employeeData[i][1];
                employeeData[i][1] = (double)employeeData[i][1] * 1.10;
                System.out.printf(" - %s received a 10%% raise. Original Salary: Php %.2f, New Salary: Php %.2f %n",
                        employeeData[i][0],originalSalary, employeeData[i][1]);
            }
        }
        System.out.println();
        System.out.println(" 2. Updating hours of worked for specific employee");
        int employeeIndex = 2;
        employeeData[employeeIndex][2] = 60;
        System.out.println(employeeData[employeeIndex][0] + "`s hours updated to: " + employeeData[employeeIndex][2]);
        System.out.println("-- Updated employee information");
        displayEmployeeInfo(employeeData);
    }

    private static void displayEmployeeInfo(Object[][] data) {

        for(Object[] employee : data){
            System.out.println("Employee Name: " + employee[0]);
            System.out.println("Employee Salary: Php " + employee[1]);
            System.out.println("Hours of work: " + employee[2]);
            System.out.println("Years of Service: " + employee[3]);
            System.out.println("is late?: " + employee[4]);
            System.out.println();
        }


    }
}
