// A class representing a playing card
class Card {
    private final String rank;  // The rank of the card (e.g., "Ace", "King", "2")
    private final String suit;  // The suit of the card (e.g., "Hearts", "Spades")
    private final int value;    // The numerical value of the card in the game

    // Constructor to create a card with specified rank, suit, and value
    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    // Getter method to retrieve the rank of the card
    public String getRank() {
        return rank;
    }

    // Getter method to retrieve the suit of the card
    public String getSuit() {
        return suit;
    }

    // Getter method to retrieve the numerical value of the card
    public int getValue() {
        return value;
    }

    // Override the toString method to provide a human-readable representation of the card
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
