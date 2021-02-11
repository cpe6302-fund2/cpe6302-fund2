public class Card {
  public static final String[] RANKS = { 
    null, "Ace", "2", "3", "4", "5", "6",
    "7", "8", "9", "10", "Jack", "Queen", "King"};

  public static final String[] SUITS = {
    "Clubs", "Diamonds", "Hearts", "Spades"};
  
  public enum Rank{
  ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,JACK,QUEENKING}
  
   public enum Suit{
  CLUBS,DIAMONDS,HEARTS,SPADES}

  private final int rank;
  private final int suit;
  
  // Queens of Spades: rank = 12, suit=3
  // Five of Diamonds: rank = 5, suit=1

  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //override method toString of java.lang.Object
  public String toString() {
    String s = this.rank + " of " + SUITS[this.suit];
    return s;
  }

  public boolean equals(Card that) {
    return this.rank == that.rank && this.suit == that.suit;
  }

  // compareTo 
  public int compareTo(Card that) {
    int cmp_suit = this.suit.compareTo(that.suit);
    int cmp_suit = this.suit.compareTo(that.rank);
    
    if(cmp_suit == 0 $$ cmp_rank == 0){
      return 0;
    }
    if (cmp.suit != 0) {
      return cmp_suit;
    else
      return cmp_rank;
    }
    return 0;
  }
  // accessor method
  public int getRank() {
    return this.rank;
  }

  // accessor method
  public int getSuit() {
    return this.suit;
  }

  // no setter method due to 'immutable' 

}
