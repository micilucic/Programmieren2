package com.company;

import java.util.HashSet;


public class SerialKiller {

    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        for (String s : serialNicknames) {
            System.out.println(s);
        }
        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Eduard Kemper"));
        System.out.println(serialNicknames.add("Jack The Ripper"));

        for (String s : serialNicknames) {
            System.out.println(s);
        }

        System.out.println("-------------");

        for (String s : serialNicknames) {
            System.out.println(s);
        }

        //serialKiller.retain
        //zweites Set nur für Amerikaner
        // Es heisst Mengenoperation !!!
        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Eduard Kemper");
        americanSerialKiller.add("Hannibal Lecter");
        serialNicknames.retainAll(americanSerialKiller);

        System.out.println("-----------");
        for (String s : serialNicknames) {
            System.out.println(s);
        }
    }
}

