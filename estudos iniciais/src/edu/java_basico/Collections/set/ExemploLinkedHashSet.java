package edu.java_basico.Collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new LinkedHashSet<>();

        // Adicionando elementos
        conjunto.add("Elemento1");
        conjunto.add("Elemento2");
        conjunto.add("Elemento3");
        conjunto.add("Elemento1"); // Tentativa de adicionar duplicata

        // Iterando sobre os elementos
        System.out.println("Elementos no conjunto (ordem de inserção):");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
