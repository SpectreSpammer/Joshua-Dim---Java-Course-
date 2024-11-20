package day5_control_flow.decisionMaking;

public class MainSwitch {
    public static void main(String[] args) {
        int yearsOfService = 3;

        switch(yearsOfService){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");
                break;
            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:
            case 5:
                System.out.println("Employee Level: Intermediate");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;
            default:
                System.out.println("Employee Level: Expert");
                break;

        }

        String dept = "IT";
        switch (dept.toLowerCase()){
            case "it":
                System.out.println("The dept is IT");
                break;
            case "hr":
                System.out.println("The dept is HR");
                break;
            case "pr" :
                System.out.println("The dept is PR");
                    break;
            default:
                System.out.println("The dept is not exist.");
                break;

        }
    }
}
