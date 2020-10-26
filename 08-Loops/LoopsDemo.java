/**
 * Description
 *
 * @author Student Name
 * @since Date Started
 */

import java.util.Scanner;
import java.util.Random;

public class LoopsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        whileLoopDemo(scanner);
        forLoopDemo(scanner);


    }

    public static void whileLoopDemo(Scanner scanner) {

        // Use WHILE loop if you don't know how many iterations
        // will be needed

        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {

            System.out.println("Would you like a compliment? (y/n)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Your hair looks great!");
            }

            System.out.println("Would you like to play again? (y/n)");
            playAgain = scanner.nextLine();

        }

        System.out.println("Thank you for playing.");




    }





    public static void forLoopDemo(Scanner scanner) {

        // I prefer for loops for computational things
        // that have a definite number of iterations.

        for (int i = 1; i < 20; i*=2) {

           System.out.println(i);

        }

        System.out.println();

        int j = 1;
        while (j < 20) {
            System.out.println(j);
            j *= 2;
        }




//        System.out.println(i); // SCOPE!!!!


        System.out.println("\nStarting number:");
        int start = scanner.nextInt();  // 5

        System.out.println("\nEnding number:");
        int end = scanner.nextInt();  // 20

        System.out.println("\nIncrementor:");
        int increase = scanner.nextInt();

        System.out.println();

        for (int i = start; i <= end; i+=increase) {
            System.out.println(i);
        }

        System.out.println("\nEND");


        for (int i = 10; i > 0; i--) {

            System.out.println(i);

        }



    }








}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?




2. What will you always remember (never forget) from this exercise?




*/
