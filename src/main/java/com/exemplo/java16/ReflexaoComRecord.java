package com.exemplo.java16;

import java.lang.reflect.RecordComponent;

//Cenários onde o "registro de classe" é útil
//Serialização JSON/XML: bibliotecas como Jackson podem detectar os componentes de um record.
//Mapeamento ORM: como Hibernate pode identificar os atributos para persistência.
//Geradores de documentação ou código.
//Frameworks como Spring: entender que um record é uma classe de dados imutável e como tratá-la corretamente.

public class ReflexaoComRecord {
    public record Produto(String nome, double preco) {}

    public static void main(String[] args) {
        Class<?> clazz = Produto.class;

        if (clazz.isRecord()) {
            System.out.println(clazz.getSimpleName() + " é um record.");

            for (RecordComponent rc : clazz.getRecordComponents()) {
                System.out.println("Componente: " + rc.getName() + ", Tipo: " + rc.getType().getSimpleName());
            }
        }
    }
}
