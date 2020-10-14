import java.util.Scanner;
import java.util.Random;



public class DiceMethods {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println(dieRoll());

        int roll1 = dieRoll();
        int roll2 = dieRoll();

        int monopolyRoll = diceRoll();

        System.out.println("Roll 1 = " + roll1 + "\nRoll 2 = " + roll2);
        System.out.println("TOTAL = " + (roll1 + roll2));

        System.out.println();

        System.out.println("Enter the number of sides:");
        int numOfSides = scanner.nextInt();

        System.out.println(coolDieRoll(numOfSides));

        System.out.println(coolDiceRolls(20, 4));

        System.out.println("\nGAME OVER MAN!!!!");

    }

    public static int dieRoll() {
    // public is the access modifier - scope
    // static means it does not need to be instantiated to run
    // int is the return type (the kind of answer we're looking for)
    // dieRoll() is the name of the method
    // () is the parameter list

//        System.out.println("DEBUG: dieRoll() has been called");

        int roll = (int)(Math.random() * 6) + 1;
        return roll;

    }


    // Method overloading is when you have multiple methods
    // with the same name, but each method is uniquely
    // distinguisable based on the parameter list
    
//    public static int dieRoll(int a) {}
//    public static int dieRoll(double a) {}
//    public static int dieRoll(String c, int d){}
//    public static int dieRoll(int e, String f) {}










    public static int diceRoll() {

//        int roll = (int)(Math.random() * 6) + 1;
//        roll += (int)(Math.random() * 6) + 1;

        int roll = dieRoll();
        roll += dieRoll();

        return roll;

    }


    public static int coolDieRoll(int sides) {

        int roll = (int)(Math.random() * sides) + 1;

        return roll;

    }


    public static int coolDiceRolls(int sides, int numOfDice) {

        int roll = 0;

        int count = 0;

        // This code will repeat 'numOfDice' times
        while (count < numOfDice) {
            roll += coolDieRoll(sides);
            count++;
        }


        return roll;

    }


}






































