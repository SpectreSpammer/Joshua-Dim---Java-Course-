package day3_variables_and_data_types;

public class Developer implements EmployeeInterface {
    @Override
    public void work() {
        System.out.println("Developer is writing some code.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having a coffee break.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting.");
    }
}
