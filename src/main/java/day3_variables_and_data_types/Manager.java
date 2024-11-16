package day3_variables_and_data_types;

public class Manager implements EmployeeInterface {


    @Override
    public void work() {
        System.out.println("Manager is foreseeing the project.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is having his lunch.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the meeting.");
    }
}
