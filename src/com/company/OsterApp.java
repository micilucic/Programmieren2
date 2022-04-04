package com.company;

public class OsterApp {
    public static void main(String[] args) {

        Osterhase dieter = new Osterhase("Dieter aka. Hansi", 12, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase maria = new Osterhase("Maria");



        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getHaeschenNummer());

        System.out.println(dieter);

        System.out.println("----------------------------------------");


        System.out.println(maria.getName());
        System.out.println(maria.getAnzahlVersteckteEier());
        System.out.println(maria.getHaeschenNummer());

      //  dieter.setAnzahlVersteckteEier(5);
       // dieter.setName("Dieter (formerly known as Hansi).");



        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier()+1);
        System.out.println(dieter.getAnzahlVersteckteEier());
      //  dieter.aendereAnzahlEier(5);
        // System.out.println(dieter.anzahlVersteckteEier);

        System.out.println("-----");
        // dieter.aendereAnzahlEier();
       // System.out.println(dieter.anzahlVersteckteEier);

        System.out.println("-----");

        // dieter.anzahlVersteckteEier = -2;
        // System.out.println(dieter.anzahlVersteckteEier);

      //  System.out.println(dieter.gibMirAnzahlDerVerstecktenEier());
    }
}
