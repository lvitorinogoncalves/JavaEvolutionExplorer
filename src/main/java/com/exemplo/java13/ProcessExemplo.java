package com.exemplo.java13;

public class ProcessExemplo {
    public static void main(String[] args) throws Exception {
        // "open -a TextEdit" abre o aplicativo TextEdit no macOS
        ProcessBuilder builder = new ProcessBuilder("open", "-a", "Calculator");
        Process process = builder.start();

        ProcessHandle handle = process.toHandle();

        System.out.println("PID: " + handle.pid());
        handle.info().command().ifPresent(cmd -> System.out.println("Comando: " + cmd));
        handle.info().startInstant().ifPresent(start -> System.out.println("Iniciado em: " + start));
    }
}
