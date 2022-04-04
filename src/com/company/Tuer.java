package com.company;

public class Tuer {
    private int breite;
    private int hoehe;
    private Himmelsrichtung oeffnung;


    @Override
    public String toString() {
        return "My door is " + breite + "m bright, " + hoehe + "m high, and " + "opens in " + oeffnung + " direction.";
    }

    public Tuer (int breite, int hoehe, Himmelsrichtung oeffnung) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.oeffnung = oeffnung;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public Himmelsrichtung getOeffnung() {
        return oeffnung;
    }

    public void setOeffnung(Himmelsrichtung oeffnung) {
        this.oeffnung = oeffnung;
    }
}
