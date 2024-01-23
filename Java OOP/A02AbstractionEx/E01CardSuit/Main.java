package A02AbstractionEx.E01CardSuit;

public class Main {
    public static void main(String[] args) {

        Suit[] cards = Suit.values();

        System.out.println("Card Suits:");
        for (Suit card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }
    }
}
