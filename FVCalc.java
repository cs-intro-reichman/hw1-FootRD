// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Receive arguments from the client.
		int current_value = Integer.parseInt(args[0]); // 'currentValue'
        double annual_rate = Double.parseDouble(args[1]) / 100; // 'rate'
        double n_years  = Double.parseDouble(args[2]); // 'n'
		
		// Imply power function to calculate the rate.
		double use_mult = Math.pow(annual_rate + 1, n_years);

		// Calculate the concluded future value.
		double future_value = current_value * use_mult;

		// Print the results.
		System.out.println("After " + (int) n_years + " years, $" + current_value + " saved at " + (annual_rate * 100) + "% will yield $" + (int) future_value);
	}
}