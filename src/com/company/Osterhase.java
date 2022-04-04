package com.company;

import com.sun.security.jgss.InquireSecContextPermission;

public class Osterhase {

    private static int haeschenZaehler = 1; //man kann darauf nicht zugreifen (durch Osterhase.haeschenZaehler), weil es private ist!


    private String name;
    private int anzahlVersteckteEier;
    private int haeschenNummer;
    private HasenReligion personlicherGlaube;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }

    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public Osterhase (String name, int anzahlVersteckteEier, HasenReligion glaube) {
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;

        // haeschenNummer = 12; //jeder Osterhase soll eigene Nummer wegen der Steuer haben
        haeschenNummer = haeschenZaehler++;

    }

    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    @Override
    //Um ein Objekt mit allen Attributen als String auszugeben ! (public String to String () )
    public String toString() {
        return  name + " versteckt " + anzahlVersteckteEier +
                " Eier " + " als traditioneller Vorgang in Bezug auf seine Religion " + HasenReligion.EXTRA_BUNTE_OSTEREIER + ".";
    }

    public Osterhase (String name) {
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler++;
        personlicherGlaube = HasenReligion.LANGE_OHREN_ZEUGEN;

    }
}

   /* public void aendereAnzahlEier (int anzahlVersteckteEier) {

        //mit dieser Kondition haben wir festgelegt, dass kein Blödsinn geschrieben werden kann (z.B. -7 Eier - macht keinen Sinn !)
        if (anzahlVersteckteEier >= 0) {


            //lokale Variable oder Parameter mit gleichen Namen werden bevorzugt
            // AnzahlVersteckteEier --> Parameter
            // this referenz zeigt auf die aktuelle Instanz (auf das Objekt und nicht Parameter in der Methode!)

            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    // Methoden überladen - Methoden mit gleichem Namen - unterscheidet sich durch typ/anzahl der Parameter
        // Java weiß welche zu verwenden ist dadurch, ob wir Parameter mitgeben oder nicht
    // Hier haben wir eine ohne Parameter - dann soll Osterhase eine Dutzend Eier verstecken
    //
    public void aendereAnzahlEier () {
    anzahlVersteckteEier = 12;
    // this müssen wir nicht verwenden, weil wir keine lokale Variablen/Parameter haben !

    }
    public int gibMirAnzahlDerVerstecktenEier () {
        return anzahlVersteckteEier;
    }
}
*/