// Main.java
// Tests the Card and Deck classes

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();

        System.out.println("Drawn cards:");
        System.out.println(card1);
        System.out.println(card2);

        System.out.println("Same Suit? " + card1.sameSuit(card2));
        System.out.println("Same Rank? " + card1.sameRank(card2));
    }
}
