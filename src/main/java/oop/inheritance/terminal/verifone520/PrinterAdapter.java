package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.Printer;
import oop.library.vx520.VerifoneVx520Printer;

public class PrinterAdapter implements Printer {
    private final VerifoneVx520Printer verifoneVx520Printer;

    public PrinterAdapter() {
        verifoneVx520Printer = new VerifoneVx520Printer();
    }

    @Override
    public void print(int col, String text) {
        verifoneVx520Printer.print(col,text);
    }

    @Override
    public void lineFeed() {
        verifoneVx520Printer.lineFeed();
    }
}
