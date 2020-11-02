import java.util.Scanner;
import java.util.Random;

public class RollDice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        displayRules();

        int dieValue = rollDie();

        if (dieValue >= 4) {
            System.out.println("You rolled a larger number");
        } else {
            System.out.println("You rolled a small number");
        }

        System.out.println();

        System.out.println("How many dice would you like to roll?");
        int numOfDiceToRoll = scanner.nextInt();

        int bigRoll = rollDice(numOfDiceToRoll);
        System.out.println("Your BIG ROLL is " + bigRoll);


        System.out.println("\n\nGame over man!");


    }

    public static int rollDice(int num) {

        int sum = 0;

        for (int i = 0; i < num; i++) {

            sum += rollDie();

        }

        return sum;
    }

    public static int rollDie() {

        Random random = new Random();
        int number = random.nextInt(6) + 1;

        return number;

    }

    public static void displayRules() {

        System.out.println("Roll the die");
        System.out.println("Move your pawn");
        System.out.println("Do an action\n\n");

    }


}
