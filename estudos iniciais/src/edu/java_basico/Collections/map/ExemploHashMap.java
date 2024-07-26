package edu.java_basico.Collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando entradas
        mapa.put("Chave1", 100);
        mapa.put("Chave2", 200);
        mapa.put("Chave3", 300);

        // Obtendo valores
        int valor1 = mapa.get("Chave1");
        System.out.println("Valor associado à 'Chave1': " + valor1);

        // Atualizando entradas
        mapa.put("Chave2", 250);

        // Removendo entradas
        mapa.remove("Chave3");

        // Verificando presença de chaves ou valores
        boolean contemChave2 = mapa.containsKey("Chave2");
        System.out.println("O mapa contém 'Chave2': " + contemChave2);

        // Iterando sobre as chaves
        System.out.println("Chaves no mapa:");
        for (String chave : mapa.keySet()) {
            System.out.println(chave);
        }

        // Iterando sobre os valores
        System.out.println("Valores no mapa:");
        for (int valor : mapa.values()) {
            System.out.println(valor);
        }

        // Iterando sobre as entradas
        System.out.println("Entradas no mapa:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        // Limpando o mapa
        mapa.clear();
        System.out.println("O mapa está vazio: " + mapa.isEmpty());
    }
}