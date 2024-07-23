package ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adcionarTarefa (String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa  t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }

    //testando usando main
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println(listaTarefa.obterNumeroTotalTarefas()); //imprime 0, porque é criado uma vazio no metodo construtor

        listaTarefa.adcionarTarefa("estudar java");
        listaTarefa.adcionarTarefa("estudar java");
        listaTarefa.adcionarTarefa("estudar java");
        listaTarefa.adcionarTarefa("estudar java");

        listaTarefa.obterDescricoesTarefas();
    }
    
}
