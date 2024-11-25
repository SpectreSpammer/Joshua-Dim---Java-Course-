package day9_exceptions.typesOfException.checkedException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MainChecked {
    public static void main(String[] args) throws FileNotFoundException {
        CheckedException.readFile("C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Employees.xlsx");
        CheckedException.connectToDatabase();
    }
}
