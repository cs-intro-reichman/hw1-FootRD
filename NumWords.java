public class NumWords {
    public static void main(String[] args) {
        // Receive the input numbers.
        int input_num = Integer.parseInt(args[0]);

        // Extract hundreds, tens, and ones.
        int hundreds = input_num / 100;
        int tens = (input_num % 100) / 10;
        int ones = input_num % 10;

        // Print the results.
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}
