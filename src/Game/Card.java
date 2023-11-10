package Game;

/**
 * The Game.Card class represents a playing card with a specific rank, suit, and numerical value.
 * It provides methods to retrieve the card's rank, suit, and value, as well as a human-readable
 * representation of the card using the toString method.
 */
public class Card {
    private final String rank;  // The rank of the card (e.g., "Ace", "King", "2")
    private final String suit;  // The suit of the card (e.g., "Hearts", "Spades")
    private final int value;    // The numerical value of the card in the game

    /**
     * Constructs a new Game.Card with the specified rank, suit, and value.
     *
     * @param rank  The rank of the card (e.g., "Ace", "King", "2").
     * @param suit  The suit of the card (e.g., "Hearts", "Spades").
     * @param value The numerical value of the card in the game.
     */
    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Returns the rank of the card.
     *
     * @return The rank of the card.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return The suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns the numerical value of the card.
     *
     * @return The numerical value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Overrides the toString method to provide a human-readable representation of the card.
     *
     * @return A string representation of the card, including rank and suit.
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
