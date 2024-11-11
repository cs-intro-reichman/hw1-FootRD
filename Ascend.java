import java.util.Random;

public class Ascend {
    public static void main(String[] args) {
        // Define the random variable.
        Random rnd_num = new Random();

        // Define our max number.
        int lim = Integer.parseInt(args[0]);

        // Refer to the randomised numbers.
        int a = rnd_num.nextInt(lim);
        int b = rnd_num.nextInt(lim);
        int c = rnd_num.nextInt(lim);

        // Find the min, middle, and max numbers.
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        // Print the random numbers.
        System.out.println(a + " " + b + " " + c);

        // Print the numbers in an ascending order.
        System.out.println(min + " " + mid + " " + max);
    }
}