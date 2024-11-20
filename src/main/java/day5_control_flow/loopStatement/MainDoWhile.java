package day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        // do first -> validate
        System.out.println("Training modules completed");
        int trainingModules = 6;
        do{

            System.out.println("Completed Module: " + trainingModules);
            trainingModules++;

        }while(trainingModules < 10);
        System.out.println("All required training modules completed.");
    }
}
