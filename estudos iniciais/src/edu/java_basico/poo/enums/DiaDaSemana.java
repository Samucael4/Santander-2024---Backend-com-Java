package edu.java_basico.poo.enums;

public enum DiaDaSemana {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private final String nomeCompleto;

    // Construtor do enum
    DiaDaSemana(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Método para obter o nome completo
    public String getNomeCompleto() {
        return nomeCompleto;
    }
}


