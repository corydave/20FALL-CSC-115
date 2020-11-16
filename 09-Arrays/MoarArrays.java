import java.util.Scanner;
import java.util.Random;


public class MoarArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        arraysToo(scanner);
        copyArray(scanner);


        System.out.println("\n\nGAME OVER MAN!");

    }



    public static void copyArray(Scanner scanner) {

        System.out.println("How many numbers?");
        int size = scanner.nextInt(); // 5

        int[] numbers = new int[size];
        loadArray(numbers, scanner);

        System.out.print("numbers: ");
        displayArray(numbers);

        int[] moarNumbers = new int[numbers.length + 1];
        addOneMoarElement(numbers, moarNumbers);

        System.out.print("moarNumbers: ");
        displayArray(moarNumbers);


    }


    public static void addOneMoarElement(int[] smaller, int[] bigger) {

        for (int i = 0; i < smaller.length; i++) {
            bigger[i] = smaller[i];
        }

    }











    public static void arraysToo(Scanner scanner) {

        System.out.println("How many numbers?");
        int size = scanner.nextInt(); // 5

        if (size >= 0) {

            int[] numbers = new int[size];
            loadArray(numbers, scanner);
            displayArray(numbers);

            int sum = sumArray(numbers);
            double mean = 1.0*sum / numbers.length;

            int max = maxArray(numbers);
            int min = minArray(numbers);

            System.out.println("The sum of the numbers is " + sum);
            System.out.println("The average of the numbers is " + mean);
            System.out.println("The maximum is " + max);
            System.out.println("The minimum is " + min);

        } else {

            System.out.println("Invalid number.");
            System.out.println("Goodbye.");
            System.exit(0);
            //            return;

        }

    }

    public static int minArray(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }

    public static int maxArray(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }

    public static int sumArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }

    public static void loadArray(int[] numbers, Scanner scanner)

    {

        System.out.println("Starting load process");

        for (int i = 0; i < numbers.length; i++)

        {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();

        }

        System.out.println("Ending load process");

    }












    public static void displayArray(int[] arr) {

        System.out.print("[");

            // "Walk through the array"
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }

        System.out.print("]\n\n");

    }

}

















