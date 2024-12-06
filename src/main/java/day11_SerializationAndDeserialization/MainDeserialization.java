package day11_SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialization {
    public static void main(String[] args) {
        EmployeeSerDeser employee = null;

        try{
            FileInputStream fileInputStream = new FileInputStream(
                    "C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Students\\JoshuaDim\\joshua.xlsx");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            employee = (EmployeeSerDeser) inputStream.readObject();
            inputStream.close();
            fileInputStream.close();

            System.out.println("Deserializing employee....");
            System.out.println("First name: " + employee.name);
            System.out.println("First name: " + employee.dept);

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization " + e.getMessage());
            e.printStackTrace();
        }
    }
}
