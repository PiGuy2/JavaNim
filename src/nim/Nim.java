package nim;

import java.util.Random;

public class Nim {
	private boolean normGame;
	private boolean CPUgood;

	private int stackSize;

	private int moveN;
	private int stacks[];
	private boolean userLast;

	public Nim (boolean normalGame) {
		Random r = new Random();
		normGame = normalGame;
		CPUgood = r.nextBoolean();
		stackSize = 15;
		userLast = false;

		System.out.println("Welcome to the Nim game!");
		printInstructions();

		selectStacks();
	}

	public Nim (boolean normalGame, boolean CPUisGood) {
		normGame = normalGame;
		CPUgood = CPUisGood;
		stackSize = 15;
		userLast = false;

		System.out.println("Welcome to the Nim game!");
		printInstructions();

		selectStacks();
	}

	public Nim (boolean normalGame, boolean CPUisGood, int stack) {
		normGame = normalGame;
		CPUgood = CPUisGood;
		stackSize = stack;

		System.out.println("Welcome to the Nim game!");
		printInstructions();

		selectStacks();
	}

	private void printInstructions () {
		// TODO add instructions
	}

	private void selectStacks () {
		Random rand = new Random();
		stacks = new int [3];
		stacks[0] = rand.nextInt(stackSize) + 1;
		stacks[1] = rand.nextInt(stackSize) + 1;
		stacks[2] = rand.nextInt(stackSize) + 1;
	}

	public boolean doMove () {
		System.out.println("\n----- Move " + formatNum(moveN) + " -----");
		doUserMove();
		if (gameOver()) {
			userLast = true;
			return true;
		}
		System.out.println("    --- CPU ---");
		doCPUmove();
		return gameOver();
	}

	private void doUserMove () {
		System.out.println("Stacks:");
		System.out.println(printStack(1));
		System.out.println("Which stack would you like to take from: "); // TODO switch to user input
		// TODO user move
		moveN++;
	}

	private void doCPUmove () {
		System.out.println("The CPU removed " + "" + " from stack " + "" + ".");
		// TODO add CPU player
	}

	private String formatNum (int n) {
		if (n < 10) {
			return "0" + n;
		} else {
			return Integer.toString(n);
		}
	}

	private String printStack (int n) {
		String r = "Stack " + n + " (" + getStack(n) + "): ";
		for (int i = 0; i < getStack(n); i++) {
			r += "*";
		}
		return r;
	}

	private int getStack (int i) {
		return stacks[i - 1];
	}

	private boolean gameOver () {
		return (stacks[0] == 0) && (stacks[1] == 0) && (stacks[2] == 0);
	}

	public void win () {
		// TODO function to print who won
	}
}
