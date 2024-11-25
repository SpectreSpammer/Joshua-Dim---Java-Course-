package day9_exceptions.typesOfException.error;

import java.util.ArrayList;
import java.util.List;

public class MainError {
    public static void main(String[] args) {
        /*
        try{
            recursiveMethod(1);
        }catch (StackOverflowError sofe){
            System.out.println("StackOverflowError: " + sofe.getMessage());
        }
        */

        causeOutOfMemoryError();
    }

    private static void causeOutOfMemoryError() {
        List<byte[]> list = new ArrayList<>();
        while (true){
            list.add(new byte[1024*1024]);
        }
    }

    private static void recursiveMethod(int i) {
        System.out.println(i);
        recursiveMethod(i+1);
    }
}
