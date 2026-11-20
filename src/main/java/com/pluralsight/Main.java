package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float a  = 0f;
        double b = 0.0;
        BigDecimal bigDeci = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            a += 0.1;
            b += 0.1;
            bigDeci = bigDeci.add(new BigDecimal(0.1));

            System.out.println("float: " + a);
            System.out.println("double: " + b);
            System.out.println("BigDecimal: " + bigDeci);


        }
        boolean floatAndDouble = (double)a == b;
        BigDecimal doubleToDeci = BigDecimal.valueOf(b);
        int doubleAndDeci = bigDeci.compareTo(doubleToDeci);

        System.out.println(floatAndDouble);
        System.out.println(doubleAndDeci);


        for (int i = 0; i < 1000; i++) {
            a += 19.99f;
            b += 19.99;

        }
        System.out.println("float: " + a);
        System.out.println("double: " + b);
        System.out.println("BigDecimal: " + bigDeci);

        boolean fAndD = (double)a == b;
        BigDecimal dToBD = BigDecimal.valueOf(b);
        int dAndBD = bigDeci.compareTo(dToBD);

        System.out.println(fAndD);
        System.out.println(doubleAndDeci);

    }


}
