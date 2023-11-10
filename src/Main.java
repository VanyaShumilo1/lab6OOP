/**
 * The Main class serves as the entry point to start the Blackjack game.
 * It creates an instance of the BlackjackGame class and initiates the game by calling the play method.
 */
public class Main {

    /**
     * The main method, the entry point for starting the Blackjack game.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();  // Create an instance of the Blackjack game
        game.play();  // Start and play the game
    }
}
