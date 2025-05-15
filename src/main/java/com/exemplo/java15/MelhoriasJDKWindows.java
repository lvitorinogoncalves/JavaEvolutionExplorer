package com.exemplo.java15;

import java.nio.file.*;

public class MelhoriasJDKWindows {
    public static void main(String[] args) {
        Path uncPath = Paths.get("\\\\servidor\\compartilhamento\\arquivo.txt");

        if (Files.exists(uncPath)) {
            System.out.println("Arquivo encontrado no caminho UNC!");
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
