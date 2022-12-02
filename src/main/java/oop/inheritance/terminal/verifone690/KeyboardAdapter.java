package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.Keyboard;
import oop.library.vx690.VerifoneVx690Keyboard;


public class KeyboardAdapter implements Keyboard {
    private final VerifoneVx690Keyboard verifoneVx690Keyboard;

    public KeyboardAdapter() {
        verifoneVx690Keyboard = new VerifoneVx690Keyboard();
    }

    @Override
    public String getChar() {
        return verifoneVx690Keyboard.get();
    }
    /**No se encontraba un metodo readline para verifone**/
    @Override
    public String readLine() {
        return verifoneVx690Keyboard.get();
    }
}
