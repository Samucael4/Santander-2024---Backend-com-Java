package edu.java_basico.poo;

public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo"),
    SANTA_CATARINA("SC", "Santa Catarina"),
    MINAS_GERAIS("Minas Gerais", "MG")
    ;

    private String nome;
    private String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
}
