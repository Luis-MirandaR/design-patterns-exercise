package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Modem;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.v240m.VerifoneV240mModem;

public class ModemAdapter implements Modem {
    private final VerifoneV240mModem verifoneV240mModem;

    public ModemAdapter() {
        verifoneV240mModem = new VerifoneV240mModem();
    }

    @Override
    public void open() {
        verifoneV240mModem.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneV240mModem.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneV240mModem.close();
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
