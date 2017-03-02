package guessinggame;
import java.util.Scanner; //for input number

/**
 * GameConsole is the class for Display message from user.
 * 
 * @author Pattara Phobasawakul
 */
public class GameConsole {

	/** initialize count to count guessed times. */
	public GameConsole() {

	}

	/**
	 * the play method play a game using input from a user.
	 * 
	 * @param game
	 *            is Object of GuessingGame
	 * 
	 * @return return a correct answer.
	 */
	public int play(GuessingGame game) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guessing Game");
		boolean start = true;
		int input = 0;
		System.out.println(game.getHint());
		while (start) {
			System.out.println("Your guess?");
			input = scanner.nextInt();
			if (game.guess(input) == false) {
				System.out.println(game.getHint());
			} else {
				start = false;
			}
		}
		System.out.println(game.getHint());
		System.out.println("Number of your guessed = " + game.getCount());
		return input;

	}
}
