package edu.java_basico.Collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new LinkedHashMap<>();

        // Adicionando entradas
        mapa.put("Chave1", 100);
        mapa.put("Chave2", 200);
        mapa.put("Chave3", 300);

        // Iterando sobre as entradas
        System.out.println("Entradas no mapa (ordem de inserção):");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}