package com.exemplo.java8;

public class ExemploLambda {

    public void executar() {
        Operacao soma = (a, b) -> a + b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.println("Exemplo Lambda calcular: ");
        System.out.println(soma.calcular(5, 3));
        System.out.println(multiplicacao.calcular(5, 3));
    }

    //(parametros) -> expressão
    interface Operacao {
        int calcular(int a, int b);
    }
}