// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		// Names of diners.
		String firstDiner = args[0];
		String secondDiner = args[1];
		String thirdDiner = args[2];

        // Total bill.
        int totalBill = Integer.parseInt(args[3]);

		// Calculate the amount to be due for each diner.
		double amountEach = Math.ceil(totalBill / 3.0);

		// Print the amount to be due for each.
		System.out.println("Dear " + thirdDiner + ", " + secondDiner + ", and " + firstDiner + ": pay " + amountEach + " Shekels each.");
	}
}
