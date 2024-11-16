package day3_variables_and_data_types.primitive;

public class MainPrimitive {
    public static void main(String[] args) {

        // data type -> variable name = initialization

        //8 bit
        byte age = 123;
        System.out.println("Byte: " + age);

        //16 bit -> short, char
        short departmentCode = 12345;
        System.out.println("Short: " + departmentCode);

        char performanceGrade = 'B';
        System.out.println("Char: " + performanceGrade);

        //32 bit -> float , int
        float hourlyRate = 600.1234567890f;
        System.out.println("Float: " + hourlyRate);

        int employeeId = 1234567890;
        System.out.println("Int: " + employeeId);

        //64 bit -> long, double
        long sss = 12345678901L;
        System.out.println("Long: " + sss);

        double salary = 50000.12345678912345;
        System.out.println("Double: " + salary);

        //boolean -> true or false
        boolean isFullTime = false;
        System.out.println("Boolean: " + isFullTime);

        //String -> words
        String name = "Josh";
        System.out.println("String: " + name);

    }
}
