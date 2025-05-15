package com.exemplo.java11;

import java.util.List;

public class VarExpressaoLambda {
    public static void main(String[] args) {
        List<String> nomes = List.of("Lucas", "João", "Maria");
        nomes.stream()
                .map((var nome) -> nome.toUpperCase())
                .forEach(System.out::println);

    }
}
