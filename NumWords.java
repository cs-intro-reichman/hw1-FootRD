public class NumWords {
    public static void main(String[] args) {
        // Receive the input numbers.
        int inputNum = Integer.parseInt(args[0]);

        // Extract hundreds, tens, and ones.
        int hundreds = inputNum / 100;
        int tens = (inputNum % 100) / 10;
        int ones = inputNum % 10;

        // Print the results.
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}
