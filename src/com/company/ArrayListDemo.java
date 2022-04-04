package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //wir brauchen eine Main, damit alles funktioniert

        //wir möchten erste Collection erstellen
        ArrayList<Osterhase> mauritius = new ArrayList<>();

        Osterhase karl = new Osterhase("Karl von Hobotus", 1000, HasenReligion.EXTRA_BUNTE_OSTEREIER);
        Osterhase karla = new Osterhase("Karla von Hobotus", 500, HasenReligion.EXTRA_BUNTE_OSTEREIER);
        Osterhase uschi = new Osterhase("Uschi Kammer", 800, HasenReligion.ZUR_HEILIGEN_KAROTTE);

        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);

        //jetzt lassen wir alle durchlaufen

        for (int i = 0; i < mauritius.size(); i++) {
            System.out.println(mauritius.get(i));
        }
        //an welcher Stelle ist Karla?
        System.out.println(mauritius.indexOf(karla));

        mauritius.remove(uschi);

        //ist der Osterhase wirklich weg?
        //rechts: mauritius ist die List die wir durchgehen möchten
        //links: neue Variable, auf die das jeweils nächte Element gelegt wird

        for (Osterhase oh : mauritius) {
            System.out.println(oh);
        }
    }
}
