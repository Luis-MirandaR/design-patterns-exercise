package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.GPS;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.v240m.VerifoneV240mGPS;

public class GPSAdapter implements GPS {
    private final VerifoneV240mGPS verifoneV240mGPS;
    public GPSAdapter() {
        verifoneV240mGPS = new VerifoneV240mGPS();
    }

    @Override
    public void open() {
        verifoneV240mGPS.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneV240mGPS.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneV240mGPS.close();
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
