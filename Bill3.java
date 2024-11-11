// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		// Names of diners.
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

        // Total bill.
        int total_bill = Integer.parseInt(args[3]);

		// Calculate the amount to be due for each diner.
		double amount_per_each = Math.ceil(total_bill / 3.0);

		// Print the amount to be due for each.
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + amount_per_each + " Shekels each.");
	}
}
