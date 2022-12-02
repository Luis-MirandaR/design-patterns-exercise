package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.Display;
import oop.library.vx690.VerifoneVx690Display;

public class DisplayAdapter implements Display {
    private final VerifoneVx690Display verifoneVx690Display;

    public DisplayAdapter(){
        verifoneVx690Display = new VerifoneVx690Display();
    }

    @Override
    public void showMessage(int x, int y, String text) {
        verifoneVx690Display.showMessage(x,y,text);
    }

    @Override
    public void clear() {
        verifoneVx690Display.clear();
    }
}
