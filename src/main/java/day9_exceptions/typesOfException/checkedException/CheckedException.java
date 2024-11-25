package day9_exceptions.typesOfException.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedException {
    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        new Scanner(file);

    }

    public static void connectToDatabase(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","user","password");
        }catch (SQLException sqlException){
            System.out.println("Database Connection Failed: " + sqlException.getMessage());
        }catch (Exception e){
            System.out.println("An unexpected error occured: " + e.getMessage());
        }finally {
            System.out.println("Closing the database connection.");
        }

    }
}
