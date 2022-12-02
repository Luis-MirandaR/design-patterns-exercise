package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.ChipReader;
import oop.library.verifone.model.Card;
import oop.library.vx690.VerifoneVx690ChipReader;

public class ChipReaderAdapter implements ChipReader {
    private final VerifoneVx690ChipReader verifoneVx690ChipReader;
    public ChipReaderAdapter() {
        verifoneVx690ChipReader = new VerifoneVx690ChipReader();
    }

    @Override
    public Card readCard() {
        return verifoneVx690ChipReader.readCard();
    }
}
