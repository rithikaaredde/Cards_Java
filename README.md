This card game program simulates a deck of playing cards and allows the user to interact with the deck in various ways, such as printing cards, checking the same suit between cards, comparing ranks, and more. The program consists of three primary files:

1. Card.java: Defines a card with a rank and suit, and provides methods for comparing cards and retrieving their details.
2. Deck.java: Manages a deck of 52 cards, including functionality for shuffling, dealing, printing cards, etc.
3. Main.java: Provides a user interface, allowing the user to interact with the deck using a menu system.

**Card.java**
Card.java defines a single card in the deck. Each card has a rank (e.g., 2, 3, J, Q, K, A) and 
a suit (e.g., Hearts, Spades, Diamonds, Clubs).

Methods:

- Constructor: Initializes a new card object with a specified rank and suit.
- Parameters:
  - rank: The rank of the card (e.g., "2", "K").
  - suit: The suit of the card (e.g., "Hearts", "Clubs").
- Getters:
  - getRank(): Returns the rank of the card as a string.
  - getSuit(): Returns the suit of the card as a string.
- toString() method: Converts the card into a human-readable string format, for example, "Ace of Spades".
- sameSuit() method:
  - Compares the suit of the current card with the suit of another card.
  - Returns true if both cards have the same suit, false otherwise.
- sameRank() method:
  - Compares the rank of the current card with the rank of another card.
  - Returns true if both cards have the same rank, false otherwise.

**Deck.java**
Deck.java manages a collection of 52 cards. It allows for various operations, 
such as printing the deck, shuffling it, and dealing cards.

Methods:

- Constructor: Initializes the deck with 52 cards (13 ranks across 4 suits) and stores them in a list or array.
- printDeck() method: Prints the entire deck of 52 cards in a human-readable format.
- printCard() method: Prints the card at the specified index (0-51).
- sameCard() method: Compares two cards from the deck by their indices and checks if they have the same suit.
- compareCard() method:
  - Compares the rank of two cards from the deck by their indices.
  - It compares the ranks numerically (with face cards like Jack, Queen, and King assigned specific values).
- findCard() method: Finds and prints a card with the specified rank and suit.
- dealCard() method: Deals (prints) 5 cards from the deck.
- shuffleDeck() method: Shuffles the deck of cards randomly.

**Main.java**
Main.java serves as the entry point for the program. It provides the user with a menu system for interacting with 
the deck of cards. The user can choose from several options to perform different actions related to the deck.

Main Program Flow:

1. A Scanner object is created to take input from the user.
2. A Deck object is instantiated to manage the cards.
3. The program enters an infinite loop that presents the user with a menu of choices.
4. Based on the user’s choice, different actions are performed, such as:
  - Printing the entire deck
  - Printing a specific card
  - Checking if two cards have the same suit
  - Comparing two cards by their rank
  - Finding a card by rank and suit
  - Dealing 5 cards
  - Shuffling the deck
5. The loop continues until the user chooses to exit the program.
