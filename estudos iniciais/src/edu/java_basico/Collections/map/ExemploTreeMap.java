package edu.java_basico.Collections.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new TreeMap<>();

        // Adicionando entradas
        mapa.put("Chave3", 300);
        mapa.put("Chave1", 100);
        mapa.put("Chave2", 200);

        // Iterando sobre as entradas
        System.out.println("Entradas no mapa (ordem natural):");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}