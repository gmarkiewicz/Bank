package com.grzegorzmarkiewicz;

public abstract class Account {
    public enum AccType {
        OSOBISTE,
        FIRMOWE;
    }

    protected String name;
    protected String surname;
    protected int pesel;
    protected String accNum;
    protected boolean openedAcc;
    protected double accBalance;
    protected AccType accType;

    public Account() {

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void openAcc(String name, String surname, int pesel, String accNum) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.accNum = accNum;
        openedAcc = true;
        accBalance = 0;
    }
    public void closeAcc(){
        name = "";
        surname = "";
        pesel = 0;
        accNum = "";
        accType = null;
        accBalance = 0;
        openedAcc = false;
    }
    public boolean isOpenedAcc() {
        return openedAcc;
    }

    public void setOpenedAcc(boolean openedAcc) {
        this.openedAcc = openedAcc;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
    }

    public void income(int income) {
        if (isOpenedAcc()) {
            this.accBalance += income;
        }
    }

    public void withdraw(int withdraw) {
        if (isOpenedAcc()) {
            this.accBalance -= withdraw;
        }
    }

    public String toString() {
        return name + " " + surname + " | Nr konta: " + accNum + "\nStan konta: " + accBalance + " | Typ konta:" +
                accType + " | Czy konto jest aktywne:" + isOpenedAcc();
    }

    public abstract AccType getAccType();

}

