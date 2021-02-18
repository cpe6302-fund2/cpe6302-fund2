public class DeckTest {
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println("### shuffle the deck");
    deck.shuffle();
    deck.print();
    System.out.println("### reorder the deck");
    deck.insertionSort();
    deck.print();
  }
}
