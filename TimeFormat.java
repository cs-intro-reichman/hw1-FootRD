// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// Receive input hours from client.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		// Decide Suffix time.
		String suf_time = "AM";

		// Set relevant times to PM.
		if (hours >= 12) {
			suf_time = "PM";
			if (hours > 12) {
				hours -= 12;
			}
		}

		// Handle 00:00 case.
		if (hours == 0 && minutes == 0) {
			System.out.println("0:00 AM");
		} else {
			// Make sure minutes always have 2 digits.
			String final_minutes = String.format("%02d", minutes);
			// Print the result.
			System.out.println(hours + ":" + final_minutes + " " + suf_time);
		}
	}
}