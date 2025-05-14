package com.exemplo.java8;

public class MetodosPadraoEmInterfaces {
    public void executar() {
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
    }

    interface Veiculo {
        void acelerar();

        default void frear() {
            System.out.println("Freando o veículo...");
        }
    }

    class Carro implements Veiculo {
        @Override
        public void acelerar() {
            System.out.println("Acelerando o carro...");
        }
        // Não precisa implementar "frear()" (usa o padrão)
    }
}
