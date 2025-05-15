package com.exemplo.java12;

public class ExpressaoSwitchAprimorada {
    public static void main(String[] args) {
        String day = "TUESDAY";

        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("O dia " + day + " tem " + numLetters + " letras.");
    }
}
