package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.Keyboard;
import oop.library.vx520.VerifoneVx520Keyboard;


public class KeyboardAdapter implements Keyboard {
    private final VerifoneVx520Keyboard verifoneVx520Keyboard;

    public KeyboardAdapter() {
        verifoneVx520Keyboard = new VerifoneVx520Keyboard();
    }

    @Override
    public String getChar() {
        return verifoneVx520Keyboard.get();
    }
    /**No se encontraba un metodo readline para verifone**/
    @Override
    public String readLine() {
        return verifoneVx520Keyboard.get();
    }
}
