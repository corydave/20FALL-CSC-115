import java.util.Scanner;
import java.util.Random;

public class Pow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers (space between):");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int exp = pow(num1, num2);
        System.out.println(exp);

    }

    public static int pow(int base, int exp) {

        int result = 1;

        for (int i = 1; i <= exp; i++) {

            result *= base;

        }

        return result;

    }


}
