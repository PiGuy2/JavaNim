package nim;

import java.util.Scanner;

public class UserInput {
	public static int getStackFromUser (String message, boolean a, boolean b, boolean c) {
		Scanner s = new Scanner(System.in);
		int r;
		while (true) {
			System.out.print(message);
			r = s.nextInt();
			if ((r == 1 && a) || (r == 2 && b) || (r == 3 && c)) {
				s.close();
				return r;
			}
			System.out.println(r + " is not a valid stack number.");
		}
	}

	public static int getNumFromUser (String message, int m) {
		System.out.print(message);
		return getNumFromUser(m);
	}

	public static int getNumFromUser (int m) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int r = 0;
			s.nextLine();
			r = s.nextInt();
			if (r > 0 && r <= m) {
				s.close();
				return r;
			}
		}
	}
}
