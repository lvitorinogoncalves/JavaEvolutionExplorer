package com.exemplo.java14;

public class Records {
    public record Pessoa(String nome, int idade) {}

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas", 35);
        System.out.println(p.nome());  // Lucas
        System.out.println(p.idade()); // 35
    }
}
