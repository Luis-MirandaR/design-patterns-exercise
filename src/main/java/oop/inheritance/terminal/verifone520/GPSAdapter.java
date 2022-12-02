package oop.inheritance.terminal.verifone520;

import oop.inheritance.terminal.GPS;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.vx520.VerifoneVx520GPS;

public class GPSAdapter implements GPS {
    private final VerifoneVx520GPS verifoneVx520GPS;
    public GPSAdapter() {
        verifoneVx520GPS = new VerifoneVx520GPS();
    }

    @Override
    public void open() {
        verifoneVx520GPS.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneVx520GPS.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneVx520GPS.close();
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
