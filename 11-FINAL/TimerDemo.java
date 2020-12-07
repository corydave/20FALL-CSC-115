import java.util.Scanner;
import java.util.Random;

public class TimerDemo {

    public static void main (String[] args) {

        long startMilli = System.currentTimeMillis();
        doSomething();
        long endMilli = System.currentTimeMillis();

        long milliTime = endMilli - startMilli;
        long secondsTimeFromMilli = milliTime/1000;





        long startNano = System.nanoTime();
        doSomething();
        long endNano = System.nanoTime();

        long nanoTime = endNano - startNano;
        long secondsTimeFromNano = nanoTime/1000000000;







        System.out.println("TIME  n: " + nanoTime);
        System.out.println("TIME ms: " + milliTime);
        System.out.println("TIME  s: " + secondsTimeFromMilli);
        System.out.println("TIME  s: " + secondsTimeFromNano);

    }

    public static void doSomething() {

        int[] nums = new int[10000000];
        for (int i = 0; i < nums.length; i++) {
            Random random = new Random();
            nums[i] = random.nextInt(100);
        }

    }




}
