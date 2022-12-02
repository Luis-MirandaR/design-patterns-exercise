package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.CardSwipper;
import oop.library.vx520.VerifoneVx520CardSwipper;

public class CardSwipperAdapter implements CardSwipper {
    private final VerifoneVx520CardSwipper verifoneVx520CardSwipper;

    public CardSwipperAdapter() {
        verifoneVx520CardSwipper = new VerifoneVx520CardSwipper();
    }

    @Override
    public oop.library.verifone.model.Card readCard() {
        return verifoneVx520CardSwipper.readCard();
    }
}
