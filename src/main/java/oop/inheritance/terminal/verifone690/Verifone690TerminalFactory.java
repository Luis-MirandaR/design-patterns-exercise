package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.*;

public class Verifone690TerminalFactory extends TerminalFactory {
    @Override
    public Display getDisplay() {
        return new DisplayAdapter();
    }

    @Override
    public Keyboard getKeyboard() {
        return new KeyboardAdapter();
    }

    @Override
    public Printer getPrinter() {
        return new PrinterAdapter();
    }

    @Override
    public Ethernet getEthernet() {
        return new EthernetAdapter();
    }

    @Override
    public GPS getGPS() {
        return new GPSAdapter();
    }

    @Override
    public Modem getModem() {
        return new ModemAdapter();
    }

    @Override
    public ChipReader getChipReader() {
        return new ChipReaderAdapter();
    }

    @Override
    public CardSwipper getCardSwipper() {
        return new CardSwipperAdapter();
    }
}
