package com.exemplo.java9;

public class MetodoPrivadoInterface {
    public interface Operacoes {
        default void executar() {
            logInicio();
            System.out.println("Executando operação...");
            logFim();
        }

        private void logInicio() {
            System.out.println("Início");
        }

        private void logFim() {
            System.out.println("Fim");
        }
    }
}
