package edu.java_basico.Collections.map.ex1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome,quantidade, preco));
      }
    
      public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
      }
    
      public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
          for (Produto p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
          }
        }
        return valorTotalEstoque;
      }
    
      public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
          if (p.getPreco() > maiorPreco) {
            produtoMaisCaro = p;
            maiorPreco = p.getPreco();
          }
        }
        return produtoMaisCaro;
      }

    
}
