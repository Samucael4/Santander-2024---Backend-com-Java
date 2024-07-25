package edu.java_basico.Collections.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos
        conjunto.add("Elemento1");
        conjunto.add("Elemento2");
        conjunto.add("Elemento3");
        conjunto.add("Elemento1"); // Tentativa de adicionar duplicata

        // Exibindo o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size()); // Saída: 3

        // Verificando a presença de um elemento
        System.out.println("Contém 'Elemento2': " + conjunto.contains("Elemento2")); // Saída: true

        // Removendo um elemento
        conjunto.remove("Elemento2");
        System.out.println("Contém 'Elemento2' após remoção: " + conjunto.contains("Elemento2")); // Saída: false

        // Iterando sobre os elementos
        System.out.println("Elementos no conjunto:");
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // Limpando o conjunto
        conjunto.clear();
        System.out.println("O conjunto está vazio: " + conjunto.isEmpty()); // Saída: true
    }
}
