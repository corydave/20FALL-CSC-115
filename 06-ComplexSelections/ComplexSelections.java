import java.util.Scanner;
import java.util.Random;

// JAVA API: https://docs.oracle.com/javase/7/docs/api/index.html

public class ComplexSelections {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter year:");
//        int year = scanner.nextInt();
//
//        // && - AND - both parts need to be true!
//        if ((year % 4 == 0) && (year % 100 != 0)) {
//            System.out.println("LEAP YEAR!");
//        } else {
//            System.out.println("Not a leap year. Sorry. You lose. Good day sir!");
//        }

        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;

        if (((a > b) || (c > d)) && ((a < d) || (d > c))) {
            System.out.println("ERROR");
        }


        int number = 20;
        if ((number < 100) || (number / 0 == 10)) { // short circuit evaluation
            System.out.println("Even and less than 100");
        } else {
            System.out.println("The number was either greater than or equal to 100 OR not divisible by 2");
        }

//        if ((number < 100) && (number % 2 == 0)) {
//            System.out.println("Even and less than 100");
//        } else {
//            System.out.println("The number was either greater than or equal to 100 OR not divisible by 2");
//        }






















//        System.out.println("Enter code:");
//        int htmlCode = scanner.nextInt();

        // 100 - Continue
        // 200 - OK
        // 302 - Redirect
        // 403 - Forbidden
        // 404 - Not found
        // 418 - I'm a teapot
        // 501 - Bad gateway

//        if (htmlCode == 100)

//        switch (htmlCode) {
//            case 100:
//                System.out.println("CONTINUE");
//                System.out.println("Everything is A-OK");
//                break;  // 'break' is needed so code doesn't "fall through"
//            case 200:
//                System.out.println("OK");
//                break;
//            case 301:
//            case 302:
//                System.out.println("Redirect");
//                break;
//            case 403:
//                System.out.println("Forbidden");
//                break;
//            case 404:
//                System.out.println("Not found");
//                break;
//            case 418:
//                System.out.println("I AM A TEAPOT!!!!");
//                break;
//            case 501:
//                System.out.println("BAD GATEWAY");
//                break;
//            default:
//                System.out.println("N/A");
//        }


















//        System.out.println("Enter your grade:");
//        int grade = scanner.nextInt();

        // This code will return "D" or "F" only!
//        if (grade > 65) {
//            System.out.println("D");
//        } else if (grade > 70) {
//            System.out.println("C");
//        } else if (grade > 80) {
//            System.out.println("B");
//        } else if (grade > 90) {
//            System.out.println("A");
//        } else {
//            System.out.println("F");
//        }

//        if (grade < 65) {
//            System.out.println("F");
//        } else if (grade < 70) {
//            System.out.println("D");
//        } else if (grade < 80) {
//            System.out.println("C");
//        } else if (grade < 90) {
//            System.out.println("B");
//        } else if (grade <= 100) {
//            System.out.println("A");
//        } else {
//            System.out.println("DOES NOT COMPUTE");
//        }











//        System.out.println("Do you want a compliment?");
//        System.out.println("\t1. Yes");
//        System.out.println("\t2. No");

//        int choice = scanner.nextInt();
//        String response = scanner.nextLine();


//        if (response.trim().substring(0, 1).equalsIgnoreCase("y") || response.equals("1")) {
//            System.out.println("You are a great person!");
//        } else if (response.trim().substring(0, 1).equalsIgnoreCase("n")) {
//            System.out.println("Very good. No compliment for you.");
//        } else {
//            System.out.println("You did not enter \"Y\" or 'N'");
//        }



//        if (choice == 1) {
//            System.out.println("You are a great person!");
//        } else if (choice == 2){
//            System.out.println("Very good. No compliment for you.");
//        } else {
//            System.out.println("You did not enter 1 or 2");
//        }



//        if (choice == 1) {
//            System.out.println("You are a great person!");
//        } else {
//            System.out.println("Very good. No compliment for you.");
//        }





//        if (choice == 1) {
//            System.out.println("You are a great person!");
//        }
//
//        if (choice == 2) {
//            System.out.println("Very good. No compliment for you");
//        }




        System.out.println("GAME OVER MAN!");



    }


}








/*

 System.out.println("\nGAME OVER MAN!!!");

        int status = 404;

        switch (status) {

            case 404:
                System.out.println("Not found");
                System.out.println("Sorry!");
                break;
            case 301:
                System.out.println("hsdlkfjalksd;fj");
                break;
            case 500:
                System.out.println("dkjfalsd;fj");
                break;

        }



*/




























