package day9_exceptions.typesOfException.uncheckedException;

public class MainUncheckedException {
    public static void main(String[] args) {

        /*

        String name = null;
        System.out.println(name.length());
        */

        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("NullPointerException: " + npe.getMessage());
        }

        /*
        int[] empNames = new int[5];
        System.out.println(empNames[6]);
        */

        try{
            int[] empNames = new int[5];
            System.out.println(empNames[6]);
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("ArrayIndexOutOfBoundsException: " + aiobe.getMessage());
        }


    }

}
