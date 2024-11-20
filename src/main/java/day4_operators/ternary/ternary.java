package day4_operators.ternary;

public class ternary {
    public static void main(String[] args) {

        // condition ? expression1 : expression2
        int age = 29;
        //29 < 65
        //true
        System.out.println(age < 65 ? " not retired " : " retired");

        boolean isReceivedBonus = false;
        String receivedBonus = isReceivedBonus ? "received bonus " : " not yet received bonus";
        System.out.println("Josh has " + receivedBonus);

    }
}
