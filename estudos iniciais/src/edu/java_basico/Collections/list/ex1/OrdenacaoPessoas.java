package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasOrdemIdade = new ArrayList<>();
    Collections.sort(pessoaList);
    return pessoasOrdemIdade;
  }

  public List<Pessoa> ordemPorAltura(){
    List<Pessoa> pessoasOrdemAltura = new ArrayList<>();
    Collections.sort(pessoasOrdemAltura, new ComparatorPorAltura());
    return pessoasOrdemAltura;
  }

  
}