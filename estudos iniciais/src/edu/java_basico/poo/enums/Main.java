package edu.java_basico.poo.enums;



public class Main {
    public static void main(String[] args) {
        double resultadoSoma = Operacao.SOMA.executar(5, 3);
        double resultadoSubtracao = Operacao.SUBTRACAO.executar(5, 3);

        System.out.println("Resultado da Soma: " + resultadoSoma); // Output: 8.0
        System.out.println("Resultado da Subtração: " + resultadoSubtracao); // Output: 2.0

        DiaDaSemana hoje = DiaDaSemana.QUARTA;
        System.out.println("Hoje é: " + hoje.getNomeCompleto());
    }
}
