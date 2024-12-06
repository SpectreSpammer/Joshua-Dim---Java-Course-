package day11_SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeSerDeser employee = new EmployeeSerDeser();
        employee.name = "Joshua";
        employee.dept = "IT";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Students\\JoshuaDim\\joshua.xlsx",false);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(employee);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in joshua.txt");
            LOGGER.info("LOG in joshua.txt");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
