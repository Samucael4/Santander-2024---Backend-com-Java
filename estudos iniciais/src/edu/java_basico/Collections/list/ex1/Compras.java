package ex1;

public class Compras {
    private String nome;
    private int quantidade;
    private float preco;
    
    public Compras(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    
}
