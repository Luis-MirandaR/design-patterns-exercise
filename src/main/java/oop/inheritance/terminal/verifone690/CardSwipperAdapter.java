package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.CardSwipper;
import oop.library.vx690.VerifoneVx690CardSwipper;

public class CardSwipperAdapter implements CardSwipper {
    private final VerifoneVx690CardSwipper verifoneVx690CardSwipper;

    public CardSwipperAdapter() {
        verifoneVx690CardSwipper = new VerifoneVx690CardSwipper();
    }

    @Override
    public oop.library.verifone.model.Card readCard() {
        return verifoneVx690CardSwipper.readCard();
    }
}
