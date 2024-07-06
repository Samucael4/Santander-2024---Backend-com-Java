package edu.java_basico.poo.interfaces;

public class Gato implements Animais {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }

    @Override
    public void mover() {
        System.out.println("O gato anda silenciosamente");
    }

}
