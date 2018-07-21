package com.grzegorzmarkiewicz;

public class Private extends Account {
    private int nip;
    private AccType accType = AccType.OSOBISTE;

    public Private(){
    }

    public void openAcc(String name, String surname, int pesel, String accNum, int nip) {
        super.openAcc(name, surname, pesel, accNum);
        this.nip = nip;
    }

    public void closeAcc() {
        super.closeAcc();
        this.nip = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | NIP: " + nip;
    }

    @Override
    public AccType getAccType() {
        return accType;
    }
}
