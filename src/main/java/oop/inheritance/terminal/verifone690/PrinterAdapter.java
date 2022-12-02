package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.Printer;
import oop.library.vx690.VerifoneVx690Printer;

public class PrinterAdapter implements Printer {
    private final VerifoneVx690Printer verifoneVx690Printer;

    public PrinterAdapter() {
         verifoneVx690Printer = new VerifoneVx690Printer();
    }

    @Override
    public void print(int col, String text) {
        verifoneVx690Printer.print(col,text);
    }

    @Override
    public void lineFeed() {
        verifoneVx690Printer.lineFeed();
    }
}
