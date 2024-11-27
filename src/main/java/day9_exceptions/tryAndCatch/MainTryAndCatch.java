package day9_exceptions.tryAndCatch;



public class MainTryAndCatch {
    public static void main(String[] args) {

       Employee employee = new Employee("Joshua",50000.75);
        try{
            employee.raiseSalary(-50);
        }catch (Exception e){
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
