package com.company;

public class Fraction {

    private int numerator;
    private int denominator;

    private static int bruchZaehler = 1;




    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
        bruchZaehler++;
    }

    public static int getBruchZaehler() {
        return bruchZaehler;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return (numerator / denominator);
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }

    public Fraction multiplicate(Fraction b2, Fraction b3) {
        Fraction neuerBruch = new Fraction(numerator, denominator);
        neuerBruch.numerator *= b2.numerator * b3.numerator;
        neuerBruch.denominator *= b2.denominator * b3.denominator;
        return neuerBruch;

    }

    public Fraction add(Fraction b2) {
        Fraction neuerBruch = new Fraction(numerator, denominator);

                if (neuerBruch.denominator == b2.denominator) {
                    neuerBruch.numerator += b2.numerator;
                } else {
                    neuerBruch.denominator *= b2.denominator;

                }
                return neuerBruch;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Fraction b1 = new Fraction(3,5);
        Fraction b2 = new Fraction(6,3);
        Fraction b3 = new Fraction(7,4);

        Fraction mult = b1.multiplicate(b2, b3);
        System.out.println(mult);
        System.out.println(getBruchZaehler());


        System.out.println(Fraction.bruchZaehler);
        System.out.println(getBruchZaehler());
        System.out.println(b1);
        System.out.println(b2);
    }
}
