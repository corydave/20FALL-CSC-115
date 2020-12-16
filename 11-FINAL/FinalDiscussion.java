public class FinalDiscussion {

  public static void main (String[] args) {


        try {

            System.out.print("Loading");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");

        } catch (Exception e) {

        }

  }
  
    public static boolean checkDice(int[] die) {

        // This method will walk through the array, and if any two
        // consecutive elements are not equal, this method will
        // return FALSE. But if all consecutive elements are equal,
        // return TRUE.
        for (int i = 1; i < die.length; i++) {

            if (die[i] != die[i-1]) {
                return false;
            }

        }

        return true;

    }
  

}
