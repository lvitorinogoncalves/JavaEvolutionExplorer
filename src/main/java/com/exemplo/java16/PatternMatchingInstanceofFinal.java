package com.exemplo.java16;

public class PatternMatchingInstanceofFinal {
    public static void main(String[] args) {
        Object obj = "Olá Java 16!";
        //Antes
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        //Com Pattern Matching
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
