// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		// Names of diners.
		String firstDiner = args[0];
		String secondDiner = args[1];
		String thirdDiner = args[2];

        // Total bill.
        int total_bill = Integer.parseInt(args[3]);

		// Calculate the amount to be due for each diner.
		double amount_per_each = Math.ceil(total_bill / 3.0);

		// Print the amount to be due for each.
		System.out.println("Dear " + firstDiner + ", " + secondDiner + ", and " + thirdDiner + ": pay " + amount_per_each + " Shekels each.");
	}
}
