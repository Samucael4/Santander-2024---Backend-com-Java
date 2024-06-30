package edu.java_basico.logica;

//como pode ver, isso é um package. numa IDE seria, seria apenas uma pasta chamada edu.java_basico.logica
import java.util.Scanner;

//mas como é o vscode, tenho que ficar criando pastas para cada camada.

public class Anotacoes {
public static void main(String[] args) {
    // usar final para simbolizar constantes
    final String nomePais = "Brasil";
    // constantes deve sempre estar em caixa alta
    final String MODO_CERTO = "oi";

    // variaveis: String, int, boolean, double, char, byte, short, long, float
    int cep = 1234045;
    int cpf = 12356456;
    // caso comece com 0, pode ser q o java nao armazene o 0, portanto pode ser
    // aconselhavel usar String para cep e cpf
    // float tem q ter o f no final, assim como long o l ex: float numero = 34.6f

    // metodos
    // metodo deve ser no infinitivo, ex: somar
    // public static int somar(int x, int y) {
    //     return x + y;
    // }

    // concatenando usar concat ou +
    String nome1 = "Porto";
    String nome2 = "Portugal";
    String nomeCompleto = nome1.concat(" ").concat(nome2);

    // casting, como int pode ser maior q short, tenho que tranformar
    int numero = 1;
    short numero2 = (short) numero;

    // operadores
    // ternario
    // expressao condicional ? case true : case false
    // comparacao se for usada para texto, é melhor usar metodo equals() do que usar
    // o ==
    // String nome3 = "OI";
    // String nome4 = new String("OI");
    // System.out.println(nome3.equals(nome4)); //retorna true, mas se fosse usar ==
    // daria false
    // logicos && ||

    /*
     * usando o terminal
     * public static void main (String[] args){
     * String nome = args [0];
     * int idade = args [1];
     * }
     * argumentos: no terminal: java <nome da classe> <arg 1> ... <arg n>
     * posso tbm deixar configurado em json os args para toda vez q dar run, nao ter
     * q passar os args
     * 
     * Scanner
     */
    Scanner scanner = new Scanner(System.in);
    double altura = scanner.nextDouble();
    String nome = scanner.next();

    // ternario, joga para uma variavel o vlaor do ? ou do :
    int nota = 6;
    String resultado = nota >= 7 ? "aprovado" : nota == 5 ? "recuperação" : "reprovado";
    
    
    // exceções e runtimeexception

    //Estrutura de um bloco com try e catch

    try {
        //  bloco de código conforme esperado
    }
    catch(Exception e) {// precisamos saber qual exceção
    // bloco de código que captura as exceções que podem acontecer
    // em caso de um fluxo não previsto
    }

    // loops
    //String[] alunos = { "Matheus", "Pedro", "João", "Lucas" };//aparentemente tem q ta dentro da main para funcionar
    // for (String aluno : alunos) {
    //     System.out.println(aluno);
    // }

    // Conversão implícita
    int num = 10;
    double d = num;
    
    // Conversão explícita
    double d2 = 10.5;
    int num2 = (int) d2;
    
    // Conversão de String para tipos primitivos
    String str = "123";
    int num3 = Integer.parseInt(str);
    
    String strDouble = "123.45";
    double d3 = Double.parseDouble(strDouble);
    
    // Conversão de tipos primitivos para String
    int num4 = 123;
    String str2 = String.valueOf(num4);
    
    double d4 = 123.45;
    String str3 = "" + d4;
    
    // Conversão de objetos
    Integer num5 = 123;
    String str4 = num5.toString();
    
    String str5 = "123";
    Integer num6 = Integer.valueOf(str5);
    
    // Conversão entre tipos personalizados
    //A a = new A(10);
    //B b = B.fromA(a);
    
}

}
