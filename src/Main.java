/**
 * Create a main class to launch the program.
 * @author Pattara Phobasawakul;
 *
 */
public class Main {

	public static void main(String[]args){
		GuessingGame game = new GuessingGame(10);
		GameConsole userin = new GameConsole();
		userin.play(game);
	}
}