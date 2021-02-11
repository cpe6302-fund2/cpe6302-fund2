public class Card2 {
    public enum RANKS { Ace, Two, Three, Four, 
        Five, Six,Seven, Eight, Nine, Ten, Jack, Queen, King};
  
    public enum SUITS {Clubs, Diamonds, Hearts, Spades};
  
    private final RANKS rank;
    private final SUITS suit;

    public Card2(RANKS rank, SUITS suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //override method toString of java.lang.Object
    public String toString() {
        String s = this.rank + " of " + this.suit;
        return s;
    }

    public boolean equals(Card2 that) {
        return this.rank == that.rank && this.suit == that.suit;
    }

    // compareTo 
    public int compareTo(Card2 that) {
        int cmp_rank = this.rank.compareTo(that.rank);
        int cmp_suit = this.suit.compareTo(that.suit);
        if(cmp_suit == 0 && cmp_rank == 0){
            return 0;
        }
        if(cmp_suit != 0)
        {
            return cmp_suit;
        }
        else
        {
            return cmp_rank;
        }
    }
    // accessor method
    public RANKS getRank() {
        return this.rank;
    }

    // accessor method
    public SUITS getSuit() {
        return this.suit;
    }

    // no setter method due to 'immutable' 

}
