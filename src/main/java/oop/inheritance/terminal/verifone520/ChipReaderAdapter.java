package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.ChipReader;
import oop.library.verifone.model.Card;
import oop.library.vx520.VerifoneVx520ChipReader;

public class ChipReaderAdapter implements ChipReader {
    private final VerifoneVx520ChipReader verifoneVx520ChipReader;
    public ChipReaderAdapter() {
        verifoneVx520ChipReader = new VerifoneVx520ChipReader();
    }

    @Override
    public Card readCard() {
        return verifoneVx520ChipReader.readCard();
    }
}
