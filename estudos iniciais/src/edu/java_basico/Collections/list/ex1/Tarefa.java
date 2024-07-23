package ex1;

public class Tarefa {

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    //ao usar metodo obterTarefa da outra classe, ele mostra o endereco de memoria
    //usar override do toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n"+descricao;
    }

}
