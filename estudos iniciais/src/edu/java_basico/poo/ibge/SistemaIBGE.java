package edu.java_basico.poo.ibge;

public class SistemaIBGE {
    public static void main(String[] args) {
        //percorrendo enum EstadosBrasileiros
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.println(e.getNome()+" "+e.getSigla());
        }

        EstadosBrasileiros sp = EstadosBrasileiros.SAO_PAULO;
        System.out.println(sp);
    }
}
