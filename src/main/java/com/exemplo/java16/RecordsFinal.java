package com.exemplo.java16;

public class RecordsFinal {
    //A classe Pessoa tem automaticamente os métodos equals, hashCode, toString e os getters.
    public record Pessoa(String nome, int idade) {
        public String saudacao() {
            return "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
        }
    }

    public class TesteRecord {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Lucas", 35);
            System.out.println(pessoa.saudacao());
        }
    }
}
