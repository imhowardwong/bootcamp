public class Deck {
  private Card[] cards;

  public Deck() {
    this.cards = new Card[Suite.values().length //
        * Rank.values().length];

    int idx = 0;
    for (Suite suite : Suite.values()) { // 4
      for (Rank rank : Rank.values()) { // 13
        this.cards[idx++] = new Card(suite, rank);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public void setCards(Card[] cards) {
    this.cards = cards;
  }

  }
  
