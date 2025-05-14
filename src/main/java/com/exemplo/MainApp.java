package com.exemplo;

import com.exemplo.java8.ExemploLambda;
import com.exemplo.java8.ExemploLambdaJavaUtilFunction;
import com.exemplo.java8.MecanismoDataHora;
import com.exemplo.java8.MetodosPadraoEmInterfaces;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Executando exemplo do Java 8:");
        ExemploLambda exemploLambda = new ExemploLambda();
        exemploLambda.executar();

        MecanismoDataHora mecanismoDataHora = new MecanismoDataHora();
        mecanismoDataHora.executar();

        MetodosPadraoEmInterfaces metodosPadraoEmInterfaces = new MetodosPadraoEmInterfaces();
        metodosPadraoEmInterfaces.executar();

        ExemploLambdaJavaUtilFunction exemploLambdaJavaUtilFunction = new ExemploLambdaJavaUtilFunction();
        exemploLambdaJavaUtilFunction.demonstrarFiltroETransformacao();
        exemploLambdaJavaUtilFunction.demonstrarSomaDosQuadrados();
        exemploLambdaJavaUtilFunction.demonstrarExemploConsumer();
        exemploLambdaJavaUtilFunction.demonstrarExemploComparator();
        exemploLambdaJavaUtilFunction.demonstrarExemploSupplier();
        exemploLambdaJavaUtilFunction.demonstrarExemploFunction();
        exemploLambdaJavaUtilFunction.demonstrarExemploPredicate();
        exemploLambdaJavaUtilFunction.demonstrarExemploRunnable();
        exemploLambdaJavaUtilFunction.demonstrarExemploOptional();
        exemploLambdaJavaUtilFunction.demonstrarExemploAgrupamento();
        exemploLambdaJavaUtilFunction.listarInterfacesFuncionais();
    }
}
