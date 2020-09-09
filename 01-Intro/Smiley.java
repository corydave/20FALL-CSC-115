// Dave Ghidiu
// 2020-09-09
// Demonstration on methods (mini-programs, subroutines, functions)

public class Smiley {

    public static void main (String[] args) {

        System.out.println("SMILEY FACE");

        printEyes();
        printNose();
        printMouth();

        System.out.println();

        printSmiley();

    }

    public static void printMouth() {

        System.out.println("   00         00");
        System.out.println("    00000000000");

    }

    public static void printEyes() {

        System.out.println("  00000    00000");
        System.out.println("  0 0 0    0 0 0");
        System.out.println("  00000    00000");

    }

    public static void printNose() {

        System.out.println();
        System.out.println("        oo");
        System.out.println();

    }

    public static void printSmiley() {

        printEyes();
        printNose();
        printMouth();

    }

}











