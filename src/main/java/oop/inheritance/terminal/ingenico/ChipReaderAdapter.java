package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.ChipReader;
import oop.library.verifone.model.Card;
import oop.library.ingenico.services.IngenicoChipReader;
import oop.library.verifone.model.ExpirationDate;

public class ChipReaderAdapter implements ChipReader {
    private final IngenicoChipReader ingenicoChipReader;

    public ChipReaderAdapter() {
        ingenicoChipReader = new IngenicoChipReader();
    }

    @Override
    public Card readCard() {
        ExpirationDate expirationDate = new ExpirationDate(2020,12);
        return new Card("123",expirationDate, null);
    }
}
