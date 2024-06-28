package edu.java_basico.logica;
//como pode ver, isso é um package. numa IDE seria, seria apenas uma pasta chamada edu.java_basico.logica
import java.util.Scanner;

//mas como é o vscode, tenho que ficar criando pastas para cada camada.

public class Anotacoes {

    // usar final para simbolizar constantes
    final String nomePais = "Brasil";
    //constantes deve sempre estar em caixa alta
    final String MODO_CERTO = "oi";

    // variaveis: String, int, boolean, double, char, byte, short, long, float
    int cep = 1234045;
    int cpf = 12356456;
    // caso comece com 0, pode ser q o java nao armazene o 0, portanto pode ser
    // aconselhavel usar String para cep e cpf
    // float tem q ter o f no final, assim como long o l ex: float numero = 34.6f


    //metodos
    // metodo deve ser no infinitivo, ex: somar
    public static int somar(int x, int y) {
        return x + y;
    }
    

    // concatenando usar concat ou +
    String nome1 = "Porto";
    String nome2 = "Portugal";
    String nomeCompleto = nome1.concat(" ").concat(nome2);

    // casting, como int pode ser maior q short, tenho que tranformar 
    int numero = 1;
    short numero2 = (short) numero;

    //operadores
    //ternario
    //expressao condicional ? case true : case false
    //comparacao se for usada para texto, é melhor usar metodo equals() do que usar o == 
    //String nome3 = "OI";
    //String nome4 = new String("OI");
    //System.out.println(nome3.equals(nome4)); //retorna true, mas se fosse usar == daria false
    //logicos && ||


    /*
     * usando o terminal
     * public static void main (String[] args){
     * String nome = args [0];
     * int idade = args [1];
     * }
     * argumentos: no terminal: java <nome da classe> <arg 1> ... <arg n>
     * posso tbm deixar configurado em json os args para toda vez q dar run, nao ter q passar os args
     * 
     * Scanner
     */
    Scanner scanner = new Scanner(System.in);
    double altura = scanner.nextDouble();
    String nome = scanner.next();
    

}
