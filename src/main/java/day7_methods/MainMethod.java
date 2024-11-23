package day7_methods;

public class MainMethod {
    public static void main(String[] args) {

        //gross salary * 0.20 *  years of service -> double + int
       double bonus =  calculateBonus(50000.75,7);
        System.out.println(" 1. Method Overloading with return values of ( double and int )");
        System.out.printf(" - Gross monthly salary is Php %.2f %n" , bonus);


        //gross salary * 0.10 -> double + String
        System.out.println(" 2. Method Overloading with return values of ( double and String )");
        System.out.println(" - " + calculateBonus(50000.75, "very good"));

        System.out.println(" 3. Method with no return value ( void )");
        printDepartment("HR");
        System.out.println(" 4. Method with no return value ( void )");
        printEmployeeInfo("Joshua", 25);
    }

    public static void printEmployeeInfo(String name, int age) {
        System.out.println(" - name:  " + name);
        System.out.println(" - age:  " + age);
    }

    public static void printDepartment(String department) {
        System.out.println(" - Employee Department: " + department);
    }

    private static String calculateBonus(double grossSalary, String performanceRating) {
        double bonusPercentage;

        switch (performanceRating.toLowerCase()){
            case "very good":
                bonusPercentage = 0.05;
                break;
            case "good":
                bonusPercentage = 0.03;
                break;
            default:
                bonusPercentage = 0.02;
                performanceRating = "average";
        }

        double totalGrossSalary = grossSalary * bonusPercentage;

        return String.format("Gross monthly salary Php %.2f, Performance Rating: %s", totalGrossSalary, performanceRating);
    }

    private static double calculateBonus(double grossSalary, int yearsOfService) {
        return grossSalary * 0.20 * yearsOfService;
    }


}
