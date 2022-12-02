package oop.inheritance.terminal;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.terminal.ingenico.IngelicoTerminalFactory;
import oop.inheritance.terminal.verifone.Verifone240TerminalFactory;
import oop.inheritance.terminal.verifone520.Verifone520TerminalFactory;
import oop.inheritance.terminal.verifone690.Verifone690TerminalFactory;

public abstract class TerminalFactory {
    public static TerminalFactory getFactory(SupportedTerminal supportedTerminal) {
        switch (supportedTerminal){
            case INGENICO:
                return new IngelicoTerminalFactory();
            case VERIFONE240M:
                return new Verifone240TerminalFactory();
            case VERIFONE520:
                return new Verifone520TerminalFactory();
            case VERIFONE690:
                return new Verifone690TerminalFactory();
        }
        return null;
    }

    public abstract Display getDisplay();
    public abstract Keyboard getKeyboard();
    public abstract Printer getPrinter();
    public abstract Ethernet getEthernet();
    public abstract GPS getGPS();
    public abstract Modem getModem();
    public abstract ChipReader getChipReader();
    public abstract CardSwipper getCardSwipper();
}
