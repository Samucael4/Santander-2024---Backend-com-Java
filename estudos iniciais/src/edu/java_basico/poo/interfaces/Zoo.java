package edu.java_basico.poo.interfaces;

public class Zoo {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.fazerSom();
        gato.mover();
        gato.dormir();//metodo default

        Animais.info();//metodo static, nao precisei usar objeto
    }
}
