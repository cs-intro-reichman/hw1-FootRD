import java.util.Random;
import java.util.Arrays;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Define a random variable.
		Random rnd_num = new Random();

		// Define our range.
		int min_num = 1;
		int max_num = 100;

		// Refer to the randomised numbers.
		int num1 = rnd_num.nextInt(max_num - min_num + 1) + min_num;
        int num2 = rnd_num.nextInt(max_num - min_num + 1) + min_num;
        int num3 = rnd_num.nextInt(max_num - min_num + 1) + min_num;

		// Create the array.
		int[] numbers = {num1, num2, num3};
        
		// Sort the array in an ascending order.
		Arrays.sort(numbers);
        
		// Print the array.
		System.out.println("Random numbers in ascending order: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
	}
}
