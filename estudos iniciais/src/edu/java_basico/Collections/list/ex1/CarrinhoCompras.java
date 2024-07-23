package ex1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Compras> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, float preco){
        carrinhoCompras.add(new Compras(nome, quantidade, preco));
    }

    public float calcularValorTotal(){
        float valorTotal = 0;
        for( Compras c : carrinhoCompras){
            valorTotal += (c.getPreco() * c.getQuantidade());
        }
        return valorTotal;
    }

    public void removerItem(String nome){
        Compras itemRemover = null;
        for (Compras c : carrinhoCompras){
            if(c.getNome().equals(nome)){
                itemRemover = c;
                break;
            }
        }
        if(itemRemover != null){
            carrinhoCompras.remove(itemRemover);
        }
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoCompras comprar = new CarrinhoCompras();

        comprar.adicionarItem("queijo", 10, 6);
        comprar.adicionarItem("pao", 15, 2);

        comprar.exibirItens();

        comprar.removerItem("pao");

        comprar.exibirItens();

        System.out.println(comprar.calcularValorTotal());
    }
}
