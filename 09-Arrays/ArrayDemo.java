import java.util.Scanner;
import java.util.Random;


public class ExceptionalLab {
    public static void main(String[] args) {

        arrays();

    }






    public static void arrays() {


        // Create an array of 'int' of size 5
        int[] grades = new int[5];

        // Load all five values manually
        grades[0] = 100;
        grades[1] = 50;
        grades[2] = 80;
        grades[3] = 81;
        grades[4] = 75;

        System.out.println();

        // Output the contents of element 3 (fourth element)
//        System.out.println(grades[3]);

        // Output the size of the array
//        System.out.println(grades.length);

        // Call a method to output the array
        displayArray(grades);

        System.out.println();

        // Create an array by hardcoding values;
        int[] ages = {29, 23, 15, 77, 101, 22, 55, 234, 43};

        // Call a method to output the array
        displayArray(ages);




//        System.out.println(grades);
        // [100, 50, 0, 0, 0]
        // [I@60e53b93


    }













    public static void displayArray(int[] arr) {

        System.out.print("[");

            // "Walk through the array"
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.print(arr[arr.length-1]);

        System.out.print("]");

    }

}

















