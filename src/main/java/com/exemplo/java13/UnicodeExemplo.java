package com.exemplo.java13;

public class UnicodeExemplo {
    public static void main(String[] args) {
        String emoji = "\uD83E\uDD70"; // 🥰 - Smiling face with hearts
        String simbolo = "Letra Geórgica: \u10FF"; // Ⴟ

        System.out.println("Emoji: " + emoji);
        System.out.println("Unicode 12.1: " + simbolo);
    }
}
