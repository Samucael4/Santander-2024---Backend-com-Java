package edu.java_basico.poo.carros;

public abstract class Veiculo {
    private String chassi = "";

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();//quando um metodo é abstrato, ele precisa ser implementado pelas classes filhas

    
}
