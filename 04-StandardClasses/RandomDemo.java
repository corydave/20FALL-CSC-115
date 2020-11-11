import java.util.Scanner;
import java.util.Random;

// JAVA API: https://docs.oracle.com/javase/7/docs/api/index.html

public class RandomDemo {

    public static void main (String[] args) {


        randomDemo();



        System.out.println("\nGAME OVER MAN!!!");

    }


    public static void randomDemo() {

        Random rand = new Random();

        int capLetter = rand.nextInt(26) + 65;
        System.out.println((char)(capLetter));



        // To generate a number between 0 and 100:
        int randNum01 = rand.nextInt(101);
        
        // To generate a number between 1 and 100:
        int randNum02 = rand.nextInt(100) + 1;



        System.out.println(rand.nextInt(54) + 1);
        System.out.println(rand.nextInt(55));
        System.out.println(rand.nextInt(55));
        System.out.println(rand.nextInt(55));
        System.out.println(rand.nextInt(55));
        System.out.println(rand.nextInt(55));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please press 1 or 2");
        int choice = scanner.nextInt();


        if (choice == 1) {
            System.out.println("Yay! You pressed 1!!!!");
        } else {
            System.out.println("BOOOOO! You didn't press 1!!!!");
        }








    }






}




























