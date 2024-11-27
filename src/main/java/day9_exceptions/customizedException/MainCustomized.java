package day9_exceptions.customizedException;

public class MainCustomized {
    public static void main(String[] args)  {

        Employee employee = new Employee("Joshua", 50000.75);

        try{
            employee.raiseSalary(50);
            System.out.println("50% raise successful.");

            employee.raiseSalary(101);
        }catch (InvalidRaiseException ire){
            System.out.println("InvalidRaiseException: " + ire.getMessage());
        }finally {
            System.out.println("Salary has been processed.");
        }

    }
}
