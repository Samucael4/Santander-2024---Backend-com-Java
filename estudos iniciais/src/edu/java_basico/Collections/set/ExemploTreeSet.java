package edu.java_basico.Collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();

        // Adicionando elementos
        conjunto.add("Elemento3");
        conjunto.add("Elemento1");
        conjunto.add("Elemento2");
        conjunto.add("Elemento1"); // Tentativa de adicionar duplicata

        // Iterando sobre os elementos
        System.out.println("Elementos no conjunto (ordem natural):");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
