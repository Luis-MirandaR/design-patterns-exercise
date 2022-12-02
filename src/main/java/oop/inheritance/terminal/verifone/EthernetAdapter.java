package oop.inheritance.terminal.verifone;

import oop.inheritance.terminal.Ethernet;
import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;
import oop.library.v240m.VerifoneV240mEthernet;

public class EthernetAdapter implements Ethernet {
    private final VerifoneV240mEthernet verifoneV240mEthernet;


    public EthernetAdapter() {
        verifoneV240mEthernet = new VerifoneV240mEthernet();
    }

    @Override
    public void open() {
        verifoneV240mEthernet.open();
    }

    @Override
    public void send(Transaction transaction) {
        byte[] array = hexStringToByteArray(transaction.toString());
        verifoneV240mEthernet.send(array);
    }

    @Override
    public TransactionResponse receive() {
        return null;
    }

    @Override
    public void close() {
        verifoneV240mEthernet.close();
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
