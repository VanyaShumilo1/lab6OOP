import java.util.ArrayList;
import java.util.List;

// A class representing a player in the Blackjack game
class Player {
    private final String name; // The name of the player
    private final ArrayList<Card> hand = new ArrayList<>(); // The player's hand, which is a list of cards
    private int score; // The player's current score

    // Constructor to create a player with a given name and an initial score of 0
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Method to add a card to the player's hand and update their score
    public void addCard(Card card) {
        hand.add(card);
        score += card.getValue();
    }

    // Getter method to get the player's current score
    public int getScore() {
        return score;
    }

    // Getter method to retrieve the player's hand of cards
    public List<Card> getHand() {
        return hand;
    }

    // Method to clear the player's hand and reset their score
    public void clearHand() {
        hand.clear();
        score = 0;
    }

    // Getter method to get the name of the player
    public String getName() {
        return name;
    }
}
