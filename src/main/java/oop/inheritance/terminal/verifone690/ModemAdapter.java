package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.Modem;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.vx690.VerifoneVx690Modem;

public class ModemAdapter implements Modem {
    private final VerifoneVx690Modem verifoneVx690Modem;

    public ModemAdapter() {
        verifoneVx690Modem = new VerifoneVx690Modem();
    }

    @Override
    public void open() {
        verifoneVx690Modem.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneVx690Modem.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneVx690Modem.close();
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
