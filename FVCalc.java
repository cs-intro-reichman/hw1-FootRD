// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Receive arguments from the client.
		int currentValue = Integer.parseInt(args[0]); // 'currentValue'
        double annualRate = Double.parseDouble(args[1]) / 100; // 'rate'
        double nYears  = Double.parseDouble(args[2]); // 'n'
		
		// Imply power function to calculate the rate.
		double use_mult = Math.pow(annualRate + 1, nYears);

		// Calculate the concluded future value.
		double future_value = currentValue * use_mult;

		// Print the results.
		System.out.println("After " + (int) nYears + " years, $" + currentValue + " saved at " + (annualRate * 100) + "% will yield $" + (int) future_value);
	}
}