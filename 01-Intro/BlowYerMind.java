// Dave Ghidiu
// 2020-09-09
// Demonstrate different outputting issues (concatenation, truncating, etc.)

public class BlowYerMind {

    public static void main (String[] args) {

        System.out.print("Hi Dave---");
        System.out.println("Hi Dave");
        System.out.println("Hi Dave---");
        
        System.out.println();
        
        // This is called the 'EMPTY STRING'
        System.out.println(""); // Don't need ""
        
        System.out.println("Hi Dave---");

        
        
        System.out.println(2);    // 2 (integer)
        System.out.println("2");  // 2 (String - characters
        System.out.println(2.1);  // 2.1 (double/decimal)
        System.out.println('2');  // 2 (char)
        System.out.println();
        System.out.println(2 + 3); // 5
        System.out.println(2 - 3); // -1

        System.out.println(2 + 3 + " Dave "); // 5 Dave
        System.out.println(2 + 3 + " Dave " + 2 + 3); // 5 Dave 23
        System.out.println(3 + 4 - 1); // 6
        System.out.println(" Dave " + 2 + 3); // Dave 23
        System.out.println(" Dave " + " John "); // Concatenate
        System.out.println(" Dave " + (2 + 3));  // Dave 5
        System.out.println(" Dave " + 2 - 3); // ERROR

        System.out.println();

        System.out.println(10/2); // 5
        System.out.println(5/2); // 2
        System.out.println(10/3); // 3
        System.out.println(99/100); // 0 (Truncate)
        System.out.println();

        // Mixed Mode Arithmetic
        System.out.println(5.0/2.0); // 2.5
        System.out.println(5.0/2); // 2.5
        System.out.println(5/2.0); // 2.5
        System.out.println(1.0*5/2); // 2.5
        System.out.println(5/2*1.0); // 2.0  WHAAAAAATTTtttttt??!?!?!

        System.out.println();

        int age = 43; // variable

        System.out.println("age"); // age
        System.out.println(age); // 42
        System.out.println(age * 10); //420
        System.out.println(1.0*age * 2); // 84.0

        System.out.println(age / 2); // 21
        System.out.println(1.0*age / 2); // 21.5
        System.out.println(age.0); // WON'T WORK!

        System.out.println("I want sharks with frickin' laser beams.");
        System.out.println("I want sharks with frickin' \"laser beams\".");

        // ESCAPE CHARACTER IS THE \

        System.out.println("\n"); // New line
        System.out.println("\t"); // Tab
        System.out.println("3\4"); // 3
        System.out.println("3\\4"); // 3\4

        System.out.println("\\\\\\\\\\\\"); // \\\\\\
        System.out.println("////////////"); // ////////////

        System.out.println("2" + "3"); // 23

    }

}











