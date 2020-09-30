import java.util.Scanner;
import java.util.Random;

// JAVA API: https://docs.oracle.com/javase/7/docs/api/index.html

public class SelectionsDemo {

    public static void main (String[] args) {

//        System.out.println(System.currentTimeMillis());

        ifStatementsDemo();



        System.out.println("\nGAME OVER MAN!!!");

    }

    public static void ifStatementsDemo() {


        /*

         Test to see if two things are equal: ==
         EXCEPT objects (Strings are objects)
           - Use '.equals()'

         */



        int a = 4;
        int b = 5;

        // DON'T DO (a = b)
        if (a == b) {
            System.out.println("YAY");
        }



        String c = "hi";
        String d = "hello";

        // DO NOT USE == with STRINGS!!! OR OBJECTS
        if (c.equals(d)) {
            System.out.println("They match");
        }

        // !=
        // DOES NOT EQUAL

        int e = 10;
        int f = 11;

        if (e != f) {
            System.out.println(e +" is not " + f);
        }

        // >, <, >=, <=

        int g = 200;
        int h = 100;

        if (g > h) {
            
            System.out.println(g + " is greater than " + h);
            System.out.println("YAY! NO BRACKETS!!!");

        } else {

            System.out.println("Oh no - g is not > h");

        }








        if (h > g) {
            System.out.println(h + " is greater than " + g);
        }



    }





}




























