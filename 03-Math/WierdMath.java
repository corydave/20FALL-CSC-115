import java.util.Scanner;

public class WierdMath {

    public static void main (String[] args) {

        chapter03Demo();
        System.out.println();
        System.out.println("GAME OVER MAN!");

    }

    public static void chapter03Demo() {

        Scanner scanner = new Scanner(System.in);

         // PRECISION ISSUE
         System.out.println(0.7 + 0.1); // .79999999999999999
        

         // ERRORS
         //   - Compile-time error/Syntax error (typo)
         //   - Run-time error
        int top = 100;
        int bottom = 5; // Change '5' to '0' for an error
        System.out.println(top/bottom);

        //    - Logic error
        System.out.println(bottom/top); // Returns 0 instead of 0.05

        // TYPE MISMATCH ERROR - Compile-time error
        System.out.println("\n================");
        int sum = 100;
        int halfSum = sum/2; // Replace '2' with '2.0' for an error
        double fourthSum = sum / 4; // 25.0
        System.out.println(fourthSum);

        // INPUT MISMATCH - Run-time error
        System.out.println("\n================");
        System.out.println("Enter your age:");
        int age = scanner.nextInt(); // Gets input from keyboard!
        System.out.println("Your age next year will be " + (age + 1)); // Input a String

        // CONSTANTS
        System.out.println("\n================");
        double priceOfSoda = 1.00;
        final double REDEMPTION_VALUE = 0.05; // Constant
        double salesTax = 1.08;

        System.out.println("You owe $" + ((priceOfSoda * salesTax) + REDEMPTION_VALUE));

//        REDEMPTION_VALUE = 3; // cannot change value of a constant


        // MATH CLASS
//        double pi = 3.1415927;
        System.out.println("\n================");
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(17));
        System.out.println(Math.round(3/4.0)); // return an int


        // CASTING
        // The process of forcing one variable to fit in another type

        System.out.println("\n================");

        int integerVariable = 3;
        double doubleVariable = 4.5;
        System.out.println("int - " + integerVariable); // 3
        System.out.println("double - " + doubleVariable); // 4.5

        System.out.println("Casting to int: " + (int)doubleVariable); // 4

        System.out.println(integerVariable);
        System.out.println("Casting to double: " + (double)integerVariable); // 3.0
        System.out.println(integerVariable);

//        System.out.println((double)age/2);

        System.out.println("\n================");
        System.out.println("Enter your age:");
        double userAge = scanner.nextDouble(); // Gets input from keyboard!
//        userAge = userAge + 1;
        userAge++; // will add 1 to userAge
        System.out.println("Your age next year will be " + ((int)userAge)); // Input a String



        System.out.println("\n================");
    }





}

























