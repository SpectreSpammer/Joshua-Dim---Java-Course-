package day5_control_flow.loopStatement;

public class WhileLoop {
    public static void main(String[] args) {

        boolean isPromotionEligble = true;
        int yearsOfService = 5;
        int performanceRating = 9;

        System.out.println("Years until next promotion");
        // false || true && true
        while(!isPromotionEligble){
            if(yearsOfService >=10 || (yearsOfService >=5 && performanceRating >=7)){
                isPromotionEligble = true;
                System.out.println("Josh is now eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Years of service: " + yearsOfService);
            }
        }
    }
}
