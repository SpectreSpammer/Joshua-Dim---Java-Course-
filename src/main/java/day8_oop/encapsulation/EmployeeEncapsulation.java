package day8_oop.encapsulation;

public class EmployeeEncapsulation {
    private int id;
    private String name;
    private double salary;

    public EmployeeEncapsulation(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if( salary > 0 ){
            this.salary = salary;
        } else{
            System.out.println("Salary must be greater than zero.");
        }
    }


    @Override
    public String toString() {
        return "Employee Information:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
