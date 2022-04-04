package com.company;

public class TuerTest {
    public static void main(String[] args) {
        Tuer home = new Tuer(2,5, Himmelsrichtung.NORDEN);

        home.setOeffnung(Himmelsrichtung.WESTEN);
        System.out.println(home.toString());
    }
}
