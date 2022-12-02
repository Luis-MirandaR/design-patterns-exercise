package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.CardSwipper;
import oop.library.ingenico.services.IngenicoCardSwipper;
import oop.library.verifone.model.Card;
import oop.library.verifone.model.ExpirationDate;


public class CardSwipperAdapter implements CardSwipper {
    private final IngenicoCardSwipper ingenicoCardSwipper;
    public CardSwipperAdapter() {
        ingenicoCardSwipper = new IngenicoCardSwipper();
    }

    /**Estoy devolviendo una cc de tipo verifone, pues al parecer hay 2 tipos de cc**/
    @Override
    public Card readCard() {
        ExpirationDate expirationDate = new ExpirationDate(2020,12);
        return new Card("123",expirationDate,null);
    }
}
