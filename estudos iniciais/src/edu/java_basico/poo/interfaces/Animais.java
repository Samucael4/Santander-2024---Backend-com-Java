package edu.java_basico.poo.interfaces;

public interface Animais {
    void fazerSom();

    void mover();

    /*
     * Interfaces com Métodos default e static
     * Exemplo de Método default:
     * 
     */
    default void dormir() {
        System.out.println("O animal está dormindo");
    }

    //Exemplo de Método static
    static void info() {
        System.out.println("Animais são seres vivos");
    }
}
