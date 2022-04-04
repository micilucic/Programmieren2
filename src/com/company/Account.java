package com.company;

import java.util.Arrays;

public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;

    public int getAccountID() {
        return accountID;
    }

    public Account(String owner, String iban, String bic) {

        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
        accountID = uniqueID++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                ", kontoStand=" + kontoStand +
                '}';
    }

    // Account konto = new Account("Milica Lucic", "AT57 6599 3425", "AUWDTA");
    private int kontoStand = 0;

    public double add(double wert) {
        return kontoStand += wert;
    }

    public double deposit (double wert) {
        if (kontoStand - wert >= 0) {
            kontoStand -= wert;
        } else {
            kontoStand = 0;
        }
        return kontoStand;
    }
    public double getBalance () {
        return kontoStand;
    }
}
