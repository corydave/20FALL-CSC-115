import java.util.Scanner;
import java.util.Random;

// JAVA API: https://docs.oracle.com/javase/7/docs/api/index.html

public class StandardClassDemo {

    public static void main (String[] args) {

/*
    Talking about classes today
     Primitive data types - int double char boolean
     Classes, on the other hand, are more complex
     Classes can both HOLD data and DO THINGS with that data
*/


        StandardClassDemo();
        System.out.println("\nGAME OVER MAN!!!");

    }


    public static void StandardClassDemo() {

        String name = "Christopher Nolan";
        int age = 42;

        System.out.println(name); // Christopher Nolan
        System.out.println(name.length()); // 17
        System.out.println(name.charAt(1)); // h - Strings are "zero-indexed"
        System.out.println(name.substring(5)); // topher Nolan
        System.out.println(name.substring(5, 8)); // top - second number is exlcusive
        System.out.println(name.toUpperCase());
        System.out.println();
        System.out.println(name);
        name = name.toUpperCase(); // Assigning the value to 'name'
        System.out.println(name);

        // Scanner is how you get input from the user

        Scanner scanner = new Scanner(System.in);
//        Class type is "Scanner"
//        The variable name we will use is "scanner" (or "fluffy")
//        "new" means you're create a new instance of the class'
//        "Scanner" is the type (again)
//        "System.in" is where the input is coming from - keyboard

//        ArrayList arr = new ArrayList();
//        ArrayList arr2 = new ArrayList();
//        Random rand = new Random();

//        Getting input from the user with SCANNER

        System.out.println();

        System.out.println("How many Legos do you own?"); // Prompt the user
        int numberOfLegos = scanner.nextInt(); // Get the input from the user and store it
        System.out.println("You have " + numberOfLegos + " legos");

        System.out.println();

        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is " + gpa);

        System.out.println();

        scanner.nextLine();

        System.out.println("Enter your dog's name:");
        String doggoName = scanner.nextLine();
        System.out.println(doggoName + " sounds like a goob dog");

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.cbrt(-27)); // -3.0
        System.out.println(Math.sqrt(41)); // 6.sfalksdfjasdlkfjasdlf

        System.out.println();

        System.out.println(Math.abs(-6.1)); // 6.1
        System.out.println(Math.abs(-6)); // 6

        System.out.println();

        System.out.println(Math.pow(2, 5)); // 32.0

        System.out.println();

        System.out.println(Math.max(3, 4)); // 4
        System.out.println(Math.max(3.0, 4.0)); // 4.0
        System.out.println(Math.max(Math.E, Math.PI)); // 3.1415956
        System.out.println(Math.max(3, 4.0)); // 4.0

        System.out.println();

        System.out.println(Math.random()); // 0.0 to 0.9999999 (never 1)
        System.out.println(System.currentTimeMillis()); // "Epoch" 1/1/1970

        int diceRoll = (int)(Math.random()*6) + 1;

        System.out.println("You rolled a " + diceRoll);

        Random rand = new Random();
        System.out.println("You rolled a " + (rand.nextInt(6) + 1));









    }





}




























