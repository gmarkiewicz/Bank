package com.grzegorzmarkiewicz;

public class Business extends Account{
    private int regon;
    private AccType accType = AccType.FIRMOWE;

    public Business(){

    }

    public void openAcc(String name, String surname, int pesel, String accNum, int regon) {
        super.openAcc(name, surname, pesel, accNum);
        this.regon = regon;
    }

    public void closeAcc() {
        super.closeAcc();
        this.regon = 0;
        accType = null;
    }

    @Override
    public AccType getAccType() {
        return accType;
    }

    @Override
    public String toString() {
        return super.toString() + " | Regon:" + regon;
    }
}
