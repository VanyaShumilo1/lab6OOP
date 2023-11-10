package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Game.Deck class represents a standard deck of playing cards, consisting of various ranks and suits.
 * It provides methods for initializing the deck, shuffling the cards, and drawing cards from the top.
 */
public class Deck {
    private List<Card> cards = new ArrayList<>();  // A list to store the cards in the deck

    /**
     * Constructs a new Game.Deck, initializing it with a standard deck of 52 cards.
     * Each card has a rank, suit, and a corresponding numerical value for use in card games.
     */
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

    /**
     * Shuffles the deck by randomly swapping card positions.
     * This method uses a pseudo-random number generator to achieve randomness.
     */
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = rand.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    /**
     * Draws a card from the top of the deck and removes it from the list.
     *
     * @return The card drawn from the top of the deck, or null if the deck is empty.
     */
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}
