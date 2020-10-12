import java.util.Scanner;
import java.util.Random;

// JAVA API: https://docs.oracle.com/javase/7/docs/api/index.html

public class ExceptionalLab {

    public static void main (String[] args) {

        saltIt();

    }

    public static void saltIt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seed:");
        int seed = scanner.nextInt();

        // Seeding the RNG
        Random random = new Random(seed);

        scanner.nextLine();
        System.out.println("Enter a password:");
        String password = scanner.nextLine();

        String salt = "";

        salt += (char)(random.nextInt(58) + 65); // number between 65-122
        salt += (char)(random.nextInt(58) + 65);
        salt += (char)(random.nextInt(58) + 65);
        salt += (char)(random.nextInt(58) + 65);
        salt += (char)(random.nextInt(58) + 65);

        System.out.println("Salt: " + salt);
        System.out.println("Salted password: " + password + salt);














        System.out.println("GAME OVER MAN!");



    }


}



/*

        String name = "Dave";
        String firstLetter = name.substring(0,1);
        String firstLetter2 = "" + name.charAt(0);

        int num = 10;
        System.out.println(1.0*num/3);

        String one = "abc";
        String two = "ABC";

        System.out.println(one.compareToIgnoreCase(two));

        if (one.compareTo(two) == 0) {
            System.out.println("These two are the same");
        } else if (one.compareTo(two) > 0) {
            //
        } else {
            //
        }


 */






