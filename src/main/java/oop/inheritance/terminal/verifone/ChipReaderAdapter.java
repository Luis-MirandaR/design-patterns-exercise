package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.ChipReader;
import oop.library.v240m.VerifoneV240mChipReader;
import oop.library.verifone.model.Card;

public class ChipReaderAdapter implements ChipReader {
    private final VerifoneV240mChipReader verifoneV240mChipReader;

    public ChipReaderAdapter() {
        verifoneV240mChipReader = new VerifoneV240mChipReader();
    }

    @Override
    public Card readCard() {
        return verifoneV240mChipReader.readCard();
    }
}
