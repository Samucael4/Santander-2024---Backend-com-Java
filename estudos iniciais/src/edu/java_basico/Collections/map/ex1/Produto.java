package edu.java_basico.Collections.map.ex1;

public class Produto {
    private String nome ;
    private int quantidade ;
    private double preco;
    
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    
    public Produto(String nome, int quantidade, double preço) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preço;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preço=" + preco + "]";
    }

    
}
