import java.util.Scanner;

public class NestedForLoops {

    public static void main(String[] args) {

//        forLoopAgain();
//        System.out.println("\n\nAgain!!!!\n\n");
//        forLoopAgain2(-5);

        timesTableForLoop();
        System.out.println();
        triangleNumberForLoop();

        System.out.println("\nGame Over man!");


    }


    /*

    1: *
    2: **
    3: ***
    4: ****

    */

    public static void triangleNumberForLoop() {

        for (int i = 1; i < 10; i++) {

            System.out.print(i + ":\t");

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }



    }


    public static void timesTableForLoop() {

        for (int i = 1; i < 10; i++) {

            System.out.print(i + ":\t");

            for (int j = 1; j < 10; j++) {

                System.out.print((i * j) + "\t");

            }

            System.out.println();

        }

    }



































    public static void forLoopAgain() {

//        System.out.println("This method is running.");

        // Have a program that outputs 1-10

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }


    public static void forLoopAgain2(int num) {

//        System.out.println("This method is running.");

        // Have a program that outputs 1-10

        for (int i = num; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }



}
