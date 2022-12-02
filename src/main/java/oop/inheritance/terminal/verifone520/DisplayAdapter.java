package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.Display;
import oop.library.vx520.VerifoneVx520Display;

public class DisplayAdapter implements Display {
    private final VerifoneVx520Display verifoneVx520Display;

    public DisplayAdapter(){
        verifoneVx520Display = new VerifoneVx520Display();
    }

    @Override
    public void showMessage(int x, int y, String text) {
        verifoneVx520Display.showMessage(text,x,y);
    }

    @Override
    public void clear() {
        verifoneVx520Display.clear();
    }
}
