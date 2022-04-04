package com.company;

public class Maybe <T> {
    // T ist Platzhalter für die späteren Datentypen
    private T data;
    private int status;

    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }


    public void print () {
        switch (status) {
            case 1:
                System.out.println("Zugriff gewährt: " + data);
                break;
            case 2:
                System.out.println("Geht dich nichts an");
                break;
            case 3:
                System.out.println("Daten nicht erfasst.");
                break;
            default:
                System.out.println("Bitte Status zwischen 1 und 3 wählen.");
                break;
        }
    }
}
