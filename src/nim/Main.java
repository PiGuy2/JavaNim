package nim;

public class Main {
	public static void main (String [] args) {
		while (true) {
			Nim nim = new Nim(true, true);
			boolean o = false;
			while (!o) {
				o = nim.doMove();
			}
			nim.win();
			if (!UserInput.getYN("Would you like to play again: ")) {
				break;
			}
		}
	}
}
