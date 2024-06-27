package edu.java_basico.logica;
//como pode ver, isso é um package. numa IDE seria, seria apenas uma pasta chamada edu.java_basico.logica
//mas como é o vscode, tenho que ficar criando pastas para cada camada.

public class Anotacoes {

    //usar final para simbolizar constantes
    final String nomePais = "Brasil";

    //variaveis:  String, int, boolean, double 

    //metodo deve ser no infinitivo, ex: somar
    public static int somar (int x, int y){
        return x+y;
    }

    //concatenando usar concat ou +
    String nome1 = "Porto";
    String nome2 = "Portugal";

    String nomeCompleto = nome1.concat(" ").concat(nome2);


}
