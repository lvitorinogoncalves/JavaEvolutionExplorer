package com.exemplo.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExemploLambdaJavaUtilFunction {

    public void demonstrarFiltroETransformacao() {
        List<String> names = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda", "João", "Alice");

        List<String> processedNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(STR."\n1. Nomes filtrados e transformados(Letras maiuculas): \{processedNames}");
    }

    public void demonstrarSomaDosQuadrados() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("\n2. Soma dos quadrados dos pares: " + sum);
    }

    public void demonstrarExemploConsumer() {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        System.out.println("\n3. Imprimindo linguagens:");
        languages.forEach(lang -> System.out.println("Linguagem: " + lang));
    }

    //Ordenação Paralela de Arrays
    public void demonstrarExemploComparator() {
        List<Pessoa> people = Arrays.asList(
                new Pessoa("Carlos", 30),
                new Pessoa("Ana", 25),
                new Pessoa("João", 40),
                new Pessoa("Maria", 35)
        );

        // Ordena por idade
        people.sort((p1, p2) -> p1.getIdade() - p2.getIdade());

        System.out.println("\n4. Pessoas ordenadas por idade:");
        people.forEach(p -> System.out.println(p.getNome() + " - " + p.getIdade()));

        // Ordena por nome
        people.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println("\n   Pessoas ordenadas por nome:");
        people.forEach(p -> System.out.println(p.getNome() + " - " + p.getIdade()));
    }

    public void demonstrarExemploSupplier() {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;

        System.out.println("\n5. Números aleatórios entre 1 e 100:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }

    public void demonstrarExemploFunction() {
        Function<String, Integer> stringLength = String::length;
        List<String> words = Arrays.asList("casa", "carro", "computador", "sol");

        List<Integer> lengths = words.stream()
                .map(stringLength)
                .collect(Collectors.toList());

        System.out.println("\n6. Tamanhos das palavras: " + lengths);
    }

    //Interfaces Funcionais
    public void demonstrarExemploPredicate() {
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primes = numbers.stream()
                .filter(isPrime)
                .collect(Collectors.toList());

        System.out.println("\n7. Números primos: " + primes);
    }

    public void demonstrarExemploRunnable() {
        Runnable task = () -> {
            System.out.println("\n8. Executando tarefa em uma thread separada:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Passo " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        new Thread(task).start();
    }

    public void demonstrarExemploOptional() {
        List<String> names = Arrays.asList("Ana", null, "Carlos", null, "João");

        System.out.println("\n9. Processando lista com possíveis valores nulos:");
        names.forEach(name -> {
            Optional.ofNullable(name)
                    .ifPresentOrElse(
                            n -> System.out.println("Nome válido: " + n),
                            () -> System.out.println("Nome inválido (null)")
                    );
        });
    }

    public void demonstrarExemploAgrupamento() {
        List<Produto> Produtos = Arrays.asList(
                new Produto("Notebook", "Eletrônicos", 2500.0),
                new Produto("Smartphone", "Eletrônicos", 1500.0),
                new Produto("Camisa", "Vestuário", 80.0),
                new Produto("Calça", "Vestuário", 120.0)
        );

        Map<String, Double> averagePriceByCategory = Produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategory,
                        Collectors.averagingDouble(Produto::getPrice)
                ));

        System.out.println("\n10. Preço médio por categoria: " + averagePriceByCategory);
    }

    public List<String> listarInterfacesFuncionais() {
        return Arrays.asList(
                "Function<T,R> - Recebe T, retorna R",
                "Predicate<T> - Recebe T, retorna boolean",
                "Consumer<T> - Recebe T, sem retorno",
                "Supplier<T> - Não recebe, retorna T",
                "UnaryOperator<T> - Recebe T, retorna T (Function<T,T>)",
                "BinaryOperator<T> - Recebe dois T, retorna T",
                "BiFunction<T,U,R> - Recebe T e U, retorna R",
                "BiPredicate<T,U> - Recebe T e U, retorna boolean",
                "BiConsumer<T,U> - Recebe T e U, sem retorno",
                "ToIntFunction<T> - Recebe T, retorna int",
                "ToLongFunction<T> - Recebe T, retorna long",
                "ToDoubleFunction<T> - Recebe T, retorna double",
                "IntFunction<R> - Recebe int, retorna R",
                "LongFunction<R> - Recebe long, retorna R",
                "DoubleFunction<R> - Recebe double, retorna R",
                "IntToLongFunction - Recebe int, retorna long",
                "IntToDoubleFunction - Recebe int, retorna double",
                "LongToIntFunction - Recebe long, retorna int",
                "LongToDoubleFunction - Recebe long, retorna double",
                "DoubleToIntFunction - Recebe double, retorna int",
                "DoubleToLongFunction - Recebe double, retorna long",
                "ObjIntConsumer<T> - Recebe T e int, sem retorno",
                "ObjLongConsumer<T> - Recebe T e long, sem retorno",
                "ObjDoubleConsumer<T> - Recebe T e double, sem retorno"
        );
    }
}