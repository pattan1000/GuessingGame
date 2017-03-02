/**
 * Create a main class to launch the program.
 * @author Totsapon menkul
 *
 */
public class Main {

	public static void main(String[]args){
		GuessingGame game = new GuessingGame(10);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}