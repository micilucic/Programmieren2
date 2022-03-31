package com.company;

public class Fraction {

    private int numerator;
    private int denominator;

   // Fraction b1 = new Fraction(3,5);
   // Fraction b2 = new Fraction(6,3);
   // Fraction b3 = new Fraction(7,4);

    public Fraction (int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public double toDecimal() {
        return (numerator/denominator);
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }
    public Fraction multiplicate (Fraction b2) {
      Fraction neuerBruch = new Fraction(numerator, denominator);
      return neuerBruch= 

    }
}
