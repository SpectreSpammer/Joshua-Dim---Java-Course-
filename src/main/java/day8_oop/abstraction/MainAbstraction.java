package day8_oop.abstraction;

import day8_oop.polymorphism.EmployeePolymorphism;
import day8_oop.polymorphism.FullTimeEmployeePolymorphism;
import day8_oop.polymorphism.PartTimeEmployeePolymorphism;

public class MainAbstraction {
    public static void main(String[] args) {
        EmployeeAbstraction fte = new FullTimeEmployeeAbstraction(
                101, "Joshua", 50000.75, 25000.75);
        fte.displayInfo();
        System.out.println();

        EmployeeAbstraction pt = new PartTimeEmployeeAbstraction(
                101,"Joshua",50000.75,10,1500.75);
        pt.displayInfo();
    }
}
