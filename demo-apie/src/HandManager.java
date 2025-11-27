public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards) {
    this.cards = cards;
  }

  public void setCards(Card[] cards) {
    this.cards = cards;
  }

  public boolean withEmptyCard() {
    return cards[0] == null || cards[1] == null //
        || cards[2] == null || cards[3] == null //
        || cards[4] == null;
  }


  public boolean isFullHouse() { 
    if (withEmptyCard())
      return false;
    int[] boxes = new int[13]; 
    for (Card card : this.cards) {
      boxes[card.getRank().getValue() - 1]++;
    }

    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for (int i = 0; i < 13; i++) {
      if (boxes[i] == 0)
        zeroCount++;
      else if (boxes[i] == 2)
        twoCount++;
      else if (boxes[i] == 3)
        threeCount++;
    }
    return zeroCount == 11 && twoCount == 1 && threeCount == 1;
  }

  // Straight Flush A2543 (Diamond)


  public static void main(String[] args) {
    Card[] hand1 = new Card[] { //
        new Card(Suite.HEART, Rank.ACE)//
        , new Card(Suite.CLUB, Rank.ACE)//
        , new Card(Suite.HEART, Rank.TEN)//
        , new Card(Suite.DIAMOND, Rank.ACE) //
        , new Card(Suite.SPADE, Rank.TEN)//
    };

    Card[] hand2 = new Card[] { //
        new Card(Suite.HEART, Rank.ACE)//
        , new Card(Suite.CLUB, Rank.ACE)//
        , new Card(Suite.HEART, Rank.TEN)//
        , new Card(Suite.DIAMOND, Rank.QUEEN) //
        , new Card(Suite.SPADE, Rank.TEN)//
    };

    HandManager hm = new HandManager(hand1);
    System.out.println(hm.isFullHouse()); // true

    hm.setCards(hand2);
    System.out.println(hm.isFullHouse()); // false

    String s = "hello";
    s = "goodbye";

  }
}
  
