package edu.java_basico.poo.carros;

public class Autodromo {
public static void main(String[] args) {
    Carro jeep = new Carro();

    jeep.setChassi("4950203");
    
    System.out.println("chassi do veiculo: "+jeep.getChassi());

    jeep.ligar();
}
}
