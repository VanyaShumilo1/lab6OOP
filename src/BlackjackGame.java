import java.util.Scanner;

class BlackjackGame {
    private final Deck deck;
    private final Player player;
    private final Player dealer;

    // Constructor for the BlackjackGame class
    public BlackjackGame() {
        deck = new Deck();  // Create a new deck of cards
        player = new Player("Player");  // Create a player with the name "Player"
        dealer = new Player("Dealer");  // Create a dealer with the name "Dealer"
    }

    // Deal the initial cards to the player and dealer
    public void dealInitialCards() {
        deck.shuffle();  // Shuffle the deck of cards
        player.clearHand();  // Clear the player's hand
        dealer.clearHand();  // Clear the dealer's hand
        player.addCard(deck.draw());  // Give a card to the player
        player.addCard(deck.draw());  // Give a card to the player
        dealer.addCard(deck.draw());  // Give a card to the dealer
        dealer.addCard(deck.draw());  // Give a card to the dealer
    }

    // Method to handle the player's turn, allowing them to hit or stand
    public void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (player.getScore() < 21) {  // Continue while player's score is less than 21
            System.out.println("Your hand: " + player.getHand() + " (Score: " + player.getScore() + ")");
            System.out.print("Do you want to hit (h) or stand (s)? ");
            String choice = scanner.next().toLowerCase();  // Get the player's choice (hit or stand)
            if (choice.equals("h")) {
                player.addCard(deck.draw());  // Player chooses to hit, so deal a card to them
            } else if (choice.equals("s")) {
                break;  // Player chooses to stand, exit the loop
            } else {
                System.out.println("Invalid choice. Please enter 'h' or 's'.");  // Invalid input
            }
        }
    }

    // Method to determine the winner and display the game's result.
    public void dealerTurn() {
        while (dealer.getScore() < 17) {  // Dealer hits as long as their score is less than 17
            dealer.addCard(deck.draw());  // Dealer draws a card
        }
    }

    // Determine the winner of the game and display the result
    public void determineWinner() {
        System.out.println("Player's hand: " + player.getHand() + " (Score: " + player.getScore() + ")");
        System.out.println("Dealer's hand: " + dealer.getHand() + " (Score: " + dealer.getScore());

        // Check and compare the scores to determine the winner
        if (player.getScore() > 21 || (dealer.getScore() <= 21 && dealer.getScore() >= player.getScore())) {
            System.out.println("Dealer wins!");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Play a complete round of Blackjack
    public void play() {
        dealInitialCards();  // Deal initial cards to player and dealer
        playerTurn();  // Simulate the player's turn
        dealerTurn();  // Simulate the dealer's turn
        determineWinner();  // Determine and display the winner
    }
}