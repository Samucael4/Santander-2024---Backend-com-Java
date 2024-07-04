package edu.java_basico.poo.escola;

public class Escola {
    public static void main(String[] args) {
        Alunos miguel = new Alunos("A");

        miguel.setNome("Miguel");
        System.out.println("nome: "+miguel.getNome()+"\nturma: "+miguel.turma+"\nano: "+miguel.ano);
    }
}
