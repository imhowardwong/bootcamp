import java.util.Random;

public class ShuffleManager {
  private Deck deck;

  public ShuffleManager(Deck deck) {
    this.deck = deck;
  }

  // Shuffle Method: Pick 10 cards in the middle
  public void shuffle() {
    Card[] newCards = new Card[deck.getCards().length];
    int idx = 0;

    for (int i = 0; i < 2; i++) { 
      // random idx (20 - 40)
      int randomIdx = new Random().nextInt(21) + 20;

      idx = 0;
      for (int j = randomIdx; j < randomIdx + 10; j++) {
        System.out.println(deck.getCards()[j]);
        newCards[idx++] = deck.getCards()[j];
      }
      for (int j = 0; j < randomIdx; j++) {
        System.out.println(deck.getCards()[j]);
        newCards[idx++] = deck.getCards()[j];
      }
      for (int j = randomIdx + 10; j < deck.getCards().length; j++) {
        System.out.println(deck.getCards()[j]);
        newCards[idx++] = deck.getCards()[j];
      }
      deck.setCards(newCards);
    }

  }

  public static void main(String[] args) {
    Deck d1 = new Deck();

    ShuffleManager sm = new ShuffleManager(d1);
    sm.shuffle();

    // System.out.println(Arrays.toString(d1.getCards()));
  }
}