package edu.java_basico.poo.semana;

public class EnumsDiaSemana {
    public static void main(String[] args) {
        DiasSemanas hoje = DiasSemanas.QUARTA;
        System.out.println("Hoje é: " + hoje);

        switch (hoje) {
            case SEGUNDA:
                System.out.println("Início da semana!");
                break;
            case QUARTA:
                System.out.println("Metade da semana!");
                break;
            case SEXTA:
                System.out.println("Fim da semana!");
                break;
            default:
                System.out.println("Outro dia.");
                break;
        }
    }
}
