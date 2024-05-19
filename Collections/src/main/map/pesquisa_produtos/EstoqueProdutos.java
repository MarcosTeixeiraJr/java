package main.map.pesquisa_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    // Atributo para armazenar produtos com seus códigos como chave
    private Map<Long, Produto> estoqueProdutosMap;

    // Construtor que inicializa o Map
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    // Método para exibir todos os produtos no estoque
    public void exibirProdutos() {
        for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    // Método para calcular o valor total do estoque
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        for (Produto p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
        return valorTotalEstoque;
    }

    // Método para obter o produto mais caro do estoque
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    // Método principal para testes
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        System.out.println("Produtos no estoque inicialmente:");
        estoque.exibirProdutos();

        // Adicionando produtos ao estoque com códigos diferentes
        estoque.adicionarProduto(1L, "Produto A", 10, 5.5);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        System.out.println("\nProdutos no estoque após adições:");
        estoque.exibirProdutos();

        System.out.println("\nValor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}

