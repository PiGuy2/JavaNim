package nim;

import java.util.Scanner;

public class UserInput {
	private static Scanner s = new Scanner(System.in);

	public static int getStackFromUser (String message, boolean a, boolean b, boolean c) {
		int r;
		while (true) {
			System.out.print(message);
			r = s.nextInt();
			if ((r == 1 && a) || (r == 2 && b) || (r == 3 && c)) {
				return r;
			}
			System.out.print(r + " is not a valid stack number. The options are:");
			if (a) {
				System.out.print(" 1");
			}
			if (b) {
				System.out.print(" 2");
			}
			if (c) {
				System.out.print(" 3");
			}
			System.out.print("\n");
		}
	}

	public static int getPositiveNumFromUser () {
		return getNumFromUser(Integer.MAX_VALUE);
	}

	public static int getNumFromUser (String message, int m) {
		System.out.print(message);
		return getNumFromUser(m);
	}

	public static int getNumFromUser (int m) {
		while (true) {
			int r = 0;
			r = s.nextInt();
			if (r <= 0) {
				System.out.println(r + " is less than the minimum value. The minimum value is 1.");
			} else if (r > m) {
				System.out.println(r + " is greater than the maximum value. The maximum value is " + m + ".");
			} else {
				return r;
			}
			System.out.print("Please enter a valid number: ");
		}
	}

	public static int getIntFromUser () {
		return s.nextInt();
	}

	/**
	 * Takes input from the user and returns whether they say "yes" or "no". Not
	 * case sensitive and also allows the user to type "y" or "n". If the answer is
	 * not "yes", "no", "y", or "n", the user will be prompted again.
	 * 
	 * @param message
	 *            {@code String} to prompt the user with
	 * 
	 * @return whether the user says yes or no
	 */
	public static boolean getYN (String message) {
		while (true) {
			System.out.print(message);
			String uInput = s.next();
			if (checkMatch(uInput, "yes")) {
				return true;
			} else if (checkMatch(uInput, "no")) {
				return false;
			}
			System.out.println("Please enter 'yes' or 'no'");
		}
	}

	/**
	 * Returns whether {@code a} matches {@code b}, or whether the first letters
	 * match. Not case sensitive.
	 * 
	 * @param a
	 *            the first string
	 * @param b
	 *            the second string
	 * @return whether the strings or their first letters match
	 */
	public static boolean checkMatch (String a, String b) {
		return (a.equalsIgnoreCase(b)) || (a.substring(0, 1).equalsIgnoreCase(b.substring(0, 1)));
	}
}
