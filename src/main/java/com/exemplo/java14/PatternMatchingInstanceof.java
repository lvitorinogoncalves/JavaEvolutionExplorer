package com.exemplo.java14;

public class PatternMatchingInstanceof {
    public static void main(String[] args) {
        Object obj = "Olá Java 14!";
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
