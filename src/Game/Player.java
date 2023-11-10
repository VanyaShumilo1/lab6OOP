package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * The Game.Player class represents a participant in the Blackjack game.
 */
public class Player {
    private final String name;          // The name of the player
    private final ArrayList<Card> hand; // The player's hand, which is a list of cards
    private int score;                   // The player's current score

    /**
     * Constructs a new Game.Player with the specified name and an initial score of 0.
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    /**
     * Adds a card to the player's hand and updates their score.
     *
     * @param card The card to be added to the player's hand.
     */
    public void addCard(Card card) {
        hand.add(card);
        score += card.getValue();
    }

    /**
     * Returns the player's current score.
     *
     * @return The player's current score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the player's hand of cards.
     *
     * @return A list of cards representing the player's hand.
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Clears the player's hand and resets their score to 0.
     */
    public void clearHand() {
        hand.clear();
        score = 0;
    }

    /**
     * Returns the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }
}
