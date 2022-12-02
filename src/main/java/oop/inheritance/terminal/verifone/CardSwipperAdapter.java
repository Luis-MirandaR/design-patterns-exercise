package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.CardSwipper;
import oop.library.v240m.VerifoneV240mCardSwipper;
import oop.library.verifone.model.Card;

public class CardSwipperAdapter implements CardSwipper {
    private final VerifoneV240mCardSwipper verifoneV240mCardSwipper;

    public CardSwipperAdapter() {
        verifoneV240mCardSwipper = new VerifoneV240mCardSwipper();
    }

    @Override
    public Card readCard() {
        return verifoneV240mCardSwipper.readCard();
    }
}
