public class CardTest {

  public static int sequentialSearch(Card[] cards, Card target) {
    int count = 0;
    for (int i = 0; i < cards.length; i++) {
      count++;
      if (cards[i].equals(target)) {
        System.out.println("# of loops: " + count);
        return i;
      }
    }
    System.out.println("# of loops: " + count);
    return -1;
  }

  public static int binarySearch(Card[] cards, Card target) {
    int count = 0;

    int low = 0;
    int high = cards.length - 1;
    while (low <= high) {
      count++;
      int mid = (low + high) / 2;
      int comp = cards[mid].compareTo(target);

      if (comp == 0) {
        System.out.println("# of loops: " + count);
        return mid;
      } else if (comp < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    System.out.println("# of loops: " + count);
    return -1;
  }

  public static void printDeck(Card[] cards) {
    for (int i = 0; i < cards.length; i++) {
      System.out.println(i + " : " + cards[i]);
    }
  }

  public static void main(String[] args) {
    Card[] cards = new Card[52];
    
    int index = 0;
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card2.Rank rank : Card2.Rank.values()) {
        cards[index] = new Card(rank, suit);
        index++;
      }
    }

    printDeck(cards);
    System.out.println();

    // search for Queen of Heart
    Card queenOfHeart = new Card(12, 2);
    int pos;
    
    System.out.println("# Sequential Search");
    pos = sequentialSearch(cards, queenOfHeart);
    System.out.println(pos + ":" + cards[pos]);

    System.out.println("# Binary Search");
    pos = binarySearch(cards, queenOfHeart);
    System.out.println(pos + ":" + cards[pos]);
  }
}
