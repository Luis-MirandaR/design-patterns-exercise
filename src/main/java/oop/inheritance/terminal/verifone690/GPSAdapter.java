package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.GPS;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.vx690.VerifoneVx690GPS;

public class GPSAdapter implements GPS {
    private final VerifoneVx690GPS verifoneVx690GPS;
    public GPSAdapter() {
        verifoneVx690GPS = new VerifoneVx690GPS();
    }

    @Override
    public void open() {
        verifoneVx690GPS.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneVx690GPS.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneVx690GPS.close();
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
