package day3_variables_and_data_types;

public class Designer implements EmployeeInterface {
    @Override
    public void work() {
        System.out.println("Designer is designing a UI.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is having a short walk.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design.");
    }
}
