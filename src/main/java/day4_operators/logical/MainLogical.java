package day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {
        int yearsOfService = 25000;
        double salary = 80000;
        int hoursOfWorked = 45;
        double hourlyRate = 1000;
        int bonus = 25000;

        //TRUE && TRUE
        // true && true
       if(hoursOfWorked > 40 && salary < 60000){
           System.out.println("1. Josh worked 40 hrs this week and his salary is less than Php 60k");
       }else {
           System.out.println("1. Josh worked under time and his salary is Php 60k or more");
       }

       //TRUE || FALSE
        //FALSE || TRUE
        if(yearsOfService > 5 || salary > 70000){
            System.out.println("2. Josh is either a long time employee or highly paid");
        }else {
            System.out.println("2. Josh is neither a long time employee nor highly paid");
        }

        // TRUE
        if(bonus != yearsOfService){
            System.out.println("3. Josh bonus is not equal to his yrs of service");
        }else {
            System.out.println("3. Josh bonus is equal to his yrs of service");
        }
    }
}
