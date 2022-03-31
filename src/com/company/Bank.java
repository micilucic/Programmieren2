package com.company;

import java.util.Arrays;

public class Bank {
    public static void main(String[] args) {
        Account person1 = new Account("Milica Lucic", "AT57 6599 3425", "AUWDTA");
        Account person2 = new Account("Shaggy Baby", "AT78 4839 782", "IJFZR");
        Account person3 = new Account("Mamma Mia", "AT54 7264 736", "UFIRU");

       person1.add(34);
       person1.deposit(15);
       System.out.println(person1.getBalance());


       Account [] arrays = new Account[] {person1, person2, person3};

       for (int i = 0; i < arrays.length; i++) {
           System.out.println(arrays[i].getBalance());
       }





    }
}
