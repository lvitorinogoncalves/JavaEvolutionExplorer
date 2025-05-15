package com.exemplo.java13;

public class TextBlockExemplo {
    public static void main(String[] args) {
        String json = """
                {
                    "nome": "Lucas",
                    "idade": 35,
                    "cidade": "Forquilhinha"
                }
                """;

        System.out.println(json);
    }
}
