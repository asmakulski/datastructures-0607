package pl.infoshare.structures._4_sets._4_exercise;

import java.util.Random;

public class CardDeckGenerator {

    private static final Integer MAX_CARDS = 8;
    private static final Random random = new Random();

    public Card[] getEasyDeck() {
        return getDeck(2);
    }

    public Card[] getHardDeck() {
        return getDeck(3);
    }

    private Card[] getDeck(int typesInGame) {
        Card[] cards = new Card[MAX_CARDS];
        for (int i = 0; i < MAX_CARDS; i++) {
            int type = random.nextInt(typesInGame);
            int value = random.nextInt(4) + 2;
            cards[i] = new Card(value, getType(type));
        }

        return cards;

    }

    private CardType getType(int cardType) {
        for (CardType type: CardType.values()) {
            if (type.ordinal() == cardType) {
                return type;
            }
        }

        throw new IllegalArgumentException();
    }
}
