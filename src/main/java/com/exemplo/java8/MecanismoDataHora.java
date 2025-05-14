package com.exemplo.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MecanismoDataHora {

    public void executar() {
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = agora.format(formatador);

        System.out.println("Hoje: " + hoje);
        System.out.println("Agora formatado: " + dataFormatada);
    }
}
