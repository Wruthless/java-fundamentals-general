package colls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {

    Card(Face face, Suite suite) {
        this.face = face;
        this.suite = suite;
    }

    public static enum Face {Ace,Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    public static enum Suite {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suite suite;

    public Face getFace() {
        return face;
    }

    public Suite getSuite() {
        return suite;
    }

    @Override
    public String toString() {
        return "{" +
            "face=" + face +
            ", suite=" + suite +
            '}';
    }
}

public class DeckOfCards {

    private List<Card> list;    // list to store cards

    // set up deck of cards to shuffle
    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0;

        // For each suite in the suit enum, perform the nested loop
        for (Card.Suite suite: Card.Suite.values()) {
            // For each face in the face enum, create a new card for current face/suite
            for(Card.Face face: Card.Face.values()) {
                deck[count] = new Card(face, suite);    // new card for face/suite
                ++count;
            }
        }

        // Arrays.asList create the list view, remember this is a list LOOKING at an array under the hood.
        // You cannot use Array manipulation.
        list = Arrays.asList(deck);  // get List
        Collections.shuffle(list);   // shuffle deck in-place
    }

    public void printCards() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%10s", list.get(i), ((i + 1) % 4 ==0) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
