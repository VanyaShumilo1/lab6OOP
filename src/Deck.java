import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// A class representing a deck of playing cards
class Deck {
    private List<Card> cards = new ArrayList<>();  // A list to store the cards in the deck

    // Constructor to initialize a standard deck of 52 cards with ranks and suits
    public Deck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Populate the deck with cards of different ranks and suits
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                int value = i + 2;
                if (i >= 10) {
                    value = 10;
                }
                if (i == 12) {
                    value = 11;  // Ace can be 11 or 1 in the games
                }
                cards.add(new Card(ranks[i], suit, value));
            }
        }
    }

    // Shuffle the deck by randomly swapping card positions
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = rand.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    // Draw a card from the top of the deck and remove it from the list
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}
