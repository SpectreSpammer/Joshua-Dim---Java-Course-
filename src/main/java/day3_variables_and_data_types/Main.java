package day3_variables_and_data_types;

public class Main {
    public static void main(String[] args) {

        //Object
        EmployeeInterface manager = new Manager();
        EmployeeInterface developer = new Developer();
        EmployeeInterface designer = new Designer();

        //Array of employees
        EmployeeInterface[] employees = {manager, developer,designer};

        //Iterate using foreach
        for(EmployeeInterface employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }

    }
}
