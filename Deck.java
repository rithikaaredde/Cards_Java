// Deck.java
// Represents a deck of playing cards

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor initializes a standard deck of 52 cards
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw a card from the deck
    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    // Get the size of the deck
    public int getSize() {
        return cards.size();
    }
}
