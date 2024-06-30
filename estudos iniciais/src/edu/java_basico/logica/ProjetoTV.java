package edu.java_basico.logica;

public class ProjetoTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume +=1;
    }
    public void diminuirVolume(){
        volume -=1;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
