package edu.java_basico.poo;

public class Alunos {
    String nome;
    int idade;
    boolean passouAno = true;
    String turma;
    String ano;

    // construtor (pode ter mains de 1) se chama Sobrecarga de Construtores
    public Alunos(String turma) {
        this.turma = turma;
        this.ano = "3°";
    }

    public Alunos() {
        this.turma = "B";
        this.ano = "1°";
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isPassouAno() {
        return passouAno;
    }

    public void setPassouAno(boolean passouAno) {
        this.passouAno = passouAno;
    }
}
