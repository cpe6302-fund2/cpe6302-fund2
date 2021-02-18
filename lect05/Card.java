public class Card {
  public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, 
    SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
  }

  public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
  }

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public String toString() {
    String s = this.rank + " of " + this.suit;
    return s;
  }

  public boolean equals(Card that) {
    return this.rank == that.rank && this.suit == that.suit;
  }

  public int compareTo(Card that) {
    int suitcmp = this.suit.compareTo(that.suit);
    if (suitcmp != 0) {
      return suitcmp;
    } else {
      return this.rank.compareTo(that.rank);
    }
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

}
