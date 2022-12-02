package oop.inheritance.terminal.verifone690;

import oop.inheritance.terminal.Ethernet;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.vx690.VerifoneVx690Ethernet;

public class EthernetAdapter implements Ethernet {
    private final VerifoneVx690Ethernet verifoneVx690Ethernet;


    public EthernetAdapter() {
        verifoneVx690Ethernet = new VerifoneVx690Ethernet();
    }

    @Override
    public void open() {
        verifoneVx690Ethernet.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneVx690Ethernet.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneVx690Ethernet.close();
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
