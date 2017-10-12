package nim;

public class Main {
	public static void main (String [] args) {
		Nim nim = new Nim(false);
		boolean o = false;
		while (!o) {
			o = nim.doMove();
		}
		nim.win();
	}
}
