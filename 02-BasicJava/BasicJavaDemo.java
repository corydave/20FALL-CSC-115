public class BasicJavaDemo {

    public static void main (String[] args) {

        variableDemo();
        System.out.println("GAME OVER MAN!");

    }

    public static void variableDemo() {

        /*

        8 PRIMITIVE DATA TYPES
        =========================================
        int [integer - age, weight, etc.]
        double [decimal - GPA, money]
        char [character - 'a', '?', etc.]
        boolean [true or false]

        long [integer that is REALLY long]
        short [integer that is REALLY short]
        float [decimal but is smaller?]
        byte [integer but REALLY REALLY small]

        */

        int age = 42;
        // int age;
        // age = 42;

        double gpa = 2.89;
        int numberOfDoggosThatLiveInTheHouse = 2;

        // String is NOT a primitive data type (PDT)
        // String IS a "class"
        String dogName1 = "Quin";
        String dogName2 = "Maggie";

        // ALWAYS start with a lowercase letter!
        // No spaces
        // Mash words together with camelCaseWriting
        // Don't use special characters
        // You CAN use numbers (just not as the first character)

        System.out.println("Age = " + age + " and the GPA is = " + gpa);
        System.out.println("Doggo names: " + dogName1 + " & " + dogName2);


        // Declaring a variable means you've created one
        // Assigning a variable means you've given a value to it

        int numberOfVacationDays; // DECLARING
//        System.out.println("Vacation = " + numberOfVacationDays);

        numberOfVacationDays = 9; // ASSIGNING
        System.out.println("Vacation = " + numberOfVacationDays);

        numberOfVacationDays = 10;
        System.out.println("Vacation = " + numberOfVacationDays);

        // RHS goes first [right hand side]
        numberOfVacationDays = numberOfVacationDays + 1;
        System.out.println("Vacation = " + numberOfVacationDays);

        // RHS goes first [right hand side]
        numberOfVacationDays = numberOfVacationDays * 10;
        System.out.println("Vacation = " + numberOfVacationDays);



        // MOD (%) vs DIV (/)
        int minutes = 65;

        System.out.println("HOURS: " + minutes/60); // 65/60 = 1;
        System.out.println("MINUTES: " + minutes%60); // 65%60 = 5

        System.out.println();

        int pennies = 737;
        System.out.println("DOLLARS: " + pennies/100);
        System.out.println("CENTS: "   + pennies%100);

        System.out.println();

        // ERRORS
        // Logic error (OOPS! the program runs, but doesn't do what you expect it to do)
        // Runtime error (The program runs, but will quit - divide by 0)
        // Syntax error (The program doesn't even run - ";");


    }





}
