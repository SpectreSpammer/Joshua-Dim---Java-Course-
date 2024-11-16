package day4_operators.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {


        double baseSalary = 70000.75;
        double bonus = 50000.75;
        int yearsOfService = 7;

        // Addition +
        double grossPay = baseSalary + bonus;
        System.out.println("1. Josh gross salary is Php " + grossPay);

        //Subtraction -
        double witholdingTax = 20000.75;
        double netPay = grossPay - witholdingTax;
        System.out.println("2. Josh net salary is Php " + netPay);

        //Multiplication
        double annualSalary = baseSalary * 12;
        System.out.println("3. Josh annual salary is Php " + annualSalary);

        //Division
        double averageIncreasePerAnnum = baseSalary / yearsOfService;
        System.out.println("4. Josh average annual salary is Php " + averageIncreasePerAnnum);

        //Modulus
        int daysUntilNextPay = 365 / 120;
        System.out.println("5. Josh received his next pay is " + daysUntilNextPay);

    }
}
