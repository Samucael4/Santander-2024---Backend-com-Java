import java.util.ArrayList;
import java.util.Iterator;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");

        // Exibindo o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Obtendo e exibindo elementos
        System.out.println("Elemento na posição 1: " + lista.get(1));

        // Modificando um elemento
        lista.set(1, "NovoElemento2");
        System.out.println("Elemento modificado na posição 1: " + lista.get(1));

        // Removendo elementos
        lista.remove(0);
        lista.remove("Elemento3");

        // Verificando presença de um elemento
        boolean contem = lista.contains("NovoElemento2");
        System.out.println("A lista contém 'NovoElemento2': " + contem);

        // Iterando sobre os elementos
        System.out.println("Elementos na lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Limpando a lista
        lista.clear();
        System.out.println("A lista está vazia: " + lista.isEmpty());

        // verificar se esta vazia
        boolean vazia = lista.isEmpty();


        for (String elemento : lista) {
            System.out.println(elemento);
        }
    
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
}       

    }
}
