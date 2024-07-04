package edu.java_basico.poo.carros;

public class Carro extends Veiculo {
    
    // public void ligar(){
    // confereCombustivel();
    // confereCambio();
    // System.out.println("Ligando...");
    // }

    private void confereCombustivel() {
        System.out.println("Tanque de cobustivel cheio");
    }

    private void confereCambio() {
        System.out.println("Cambio no P");
    }

    @Override
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Ligando...");
    }
}
