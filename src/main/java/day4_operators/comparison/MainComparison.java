package day4_operators.comparison;

public class MainComparison {
    public static void main(String[] args) {

        int yearsOfService = 10;
        double salary = 60000;
        int hoursOfWorked = 40;
        double hourlyRate = 1000;

        // Equal to ==
        // 10 == 10 -> True
        if( yearsOfService == 10){
            System.out.println("1. Josh has been with the company for exactly 10 yrs.");
        }else {
            System.out.println("1. Josh years of service is not 10 yrs.");
        }

        // Not equal to !=
        //60000 != 60000.75 -> false
        if(salary != 60000){
            System.out.println("2. Josh salary is not 60000");
        }else {
            System.out.println("2. Josh salary is 60000");
        }

        // Greater than >
        // 40 > 40 -> false
        if(hoursOfWorked > 40){
            System.out.println("3. Josh worked 40 hrs this week");
        }else {
            System.out.println("3. Josh`s worked under time this week");
        }

        // Less than <
        // 600 < 1000
        if( hourlyRate < 1000){
            System.out.println("4. Josh hourly rate is less than Php 1000");
        }else {
            System.out.println("4. Josh hourly rate is Php 1000 or more.");
        }


        // Greater than or equal to >=
        //40 >= 40 ->
        if(hoursOfWorked >= 40){
            System.out.println("5. (>=) Josh worked 40 hrs this week");
        }else {
            System.out.println("5. (>=) Josh`s worked under time this week");
        }

        // Less than or equal to <=
        if( hourlyRate <= 1000){
            System.out.println("6. (<=)  Josh hourly rate is less than Php 1000");
        }else {
            System.out.println("6. (<=) Josh hourly rate is Php 1000 or more.");
        }
    }
}
