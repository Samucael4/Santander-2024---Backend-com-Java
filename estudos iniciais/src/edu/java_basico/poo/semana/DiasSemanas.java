package edu.java_basico.poo.semana;

public enum DiasSemanas {
    //exemplo básico de definição de um enum:
    //SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO

    //outra forma: Enums com campos e métodos
    /* */
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private final String nomeCompleto;

    // Construtor do enum
    DiasSemanas(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Método para obter o nome completo
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    //Enums com comportamento

}
