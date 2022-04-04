package com.company;

import javax.naming.InsufficientResourcesException;

public class WrapperTest {
    public static void main(String[] args) {

        Integer i = 22;
       // int j = new Integer(27); // diese Art von Initialisierung wird es in der Zukunft nicht mehr geben

        System.out.println(i);
        //System.out.println(j);

        int l = Integer.parseInt("22");
        System.out.println(l);

        //Unterschied wenn man es nicht verwendet:

        System.out.println("16" + 2); //=162
        System.out.println(l + 2);  //=24

    }
}
