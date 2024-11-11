import java.util.Random;

public class Ascend {
    public static void main(String[] args) {
        // Define the random variable.
        Random rnd_num = new Random();

        // Define our max number.
        int lim = Integer.parseInt(args[0]);

        // Refer to the randomised numbers.
        int firstNum = rnd_num.nextInt(lim);
        int secondNum = rnd_num.nextInt(lim);
        int thirdNum = rnd_num.nextInt(lim);

        // Find the min, middle, and max numbers.
        int min = Math.min(firstNum, Math.min(secondNum, thirdNum));
        int max = Math.max(firstNum, Math.max(secondNum, thirdNum));
        int mid = firstNum + secondNum + thirdNum - min - max;

        // Print the random numbers.
        System.out.println(firstNum + " " + secondNum + " " + thirdNum);

        // Print the numbers in an ascending order.
        System.out.println(min + " " + mid + " " + max);
    }
}