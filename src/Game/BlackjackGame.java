package Game;

import java.util.Scanner;

/**
 * The Game.BlackjackGame class represents a simple implementation of the Blackjack card game.
 * It includes methods for dealing cards, simulating the player's and dealer's turns, and determining the winner.
 */
public class BlackjackGame {
    private final Deck deck;       // The deck of cards used in the game
    private final Player player;   // The player participating in the game
    private final Player dealer;   // The dealer participating in the game

    /**
     * Constructs a new Game.BlackjackGame with a deck, player, and dealer.
     */
    public BlackjackGame() {
        deck = new Deck();          // Create a new deck of cards
        player = new Player("Game.Player");  // Create a player with the name "Game.Player"
        dealer = new Player("Dealer");  // Create a dealer with the name "Dealer"
    }

    /**
     * Deals the initial cards to the player and dealer, shuffling the deck before dealing.
     */
    public void dealInitialCards() {
        deck.shuffle();             // Shuffle the deck of cards
        player.clearHand();         // Clear the player's hand
        dealer.clearHand();         // Clear the dealer's hand
        player.addCard(deck.draw()); // Give a card to the player
        player.addCard(deck.draw()); // Give a card to the player
        dealer.addCard(deck.draw()); // Give a card to the dealer
        dealer.addCard(deck.draw()); // Give a card to the dealer
    }

    /**
     * Simulates the player's turn, allowing them to hit or stand based on user input.
     */
    public void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (player.getScore() < 21) {   // Continue while player's score is less than 21
            System.out.println("Your hand: " + player.getHand() + " (Score: " + player.getScore() + ")");
            System.out.print("Do you want to hit (h) or stand (s)? ");
            String choice = scanner.next().toLowerCase();  // Get the player's choice (hit or stand)
            if (choice.equals("h")) {
                player.addCard(deck.draw());  // Game.Player chooses to hit, so deal a card to them
            } else if (choice.equals("s")) {
                break;  // Game.Player chooses to stand, break the loop
            } else {
                System.out.println("Invalid choice. Please enter 'h' or 's'.");  // Invalid input
            }
        }
    }

    /**
     * Simulates the dealer's turn
     */
    public void dealerTurn() {
        while (dealer.getScore() < 17) {  // Dealer hits as long as their score is less than 17
            dealer.addCard(deck.draw());  // Dealer draws a card
        }
    }

    /**
     * Determines the winner of the game and displays the result.
     */
    public void determineWinner() {
        System.out.println("Game.Player's hand: " + player.getHand() + " (Score: " + player.getScore() + ")");
        System.out.println("Dealer's hand: " + dealer.getHand() + " (Score: " + dealer.getScore());

        // Check and compare the scores to determine the winner
        if (player.getScore() > 21 || (dealer.getScore() <= 21 && dealer.getScore() >= player.getScore())) {
            System.out.println("Dealer wins!");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Game.Player wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    /**
     * Plays a complete round of Blackjack, simulating player and dealer turns, and determining the winner.
     */
    public void play() {
        dealInitialCards();  // Deal initial cards to player and dealer
        playerTurn();        // Simulate the player's turn
        dealerTurn();        // Simulate the dealer's turn
        determineWinner();    // Determine and display the winner
    }
}
