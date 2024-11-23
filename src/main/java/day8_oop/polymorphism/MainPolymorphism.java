package day8_oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        EmployeePolymorphism fte = new FullTimeEmployeePolymorphism(
                101, "Joshua", 50000.75, 25000.75);
        fte.displayInfo();
        System.out.println();

        EmployeePolymorphism pt = new PartTimeEmployeePolymorphism(
                101,"Joshua",50000.75,10,1500.75);
        pt.displayInfo();
    }
}
