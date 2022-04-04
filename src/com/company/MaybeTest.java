package com.company;

public class MaybeTest {
    public static void main(String[] args) {
        //jetzt möchte ich konkrete Variablen anbieten ...

        Maybe <Double> gehalt = new Maybe<>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura", "AT67 85732839", "KAZDBF"), 1);
        meinKonto.print();
    }
}
