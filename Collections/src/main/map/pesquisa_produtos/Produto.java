package main.map.pesquisa_produtos;

public class Produto {
    // Atributos privados e finais, garantindo imutabilidade após inicialização
    private final String nome;
    private final double preco;
    private final int quantidade;

    // Construtor da classe Produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método getter para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método getter para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método getter para obter a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Método toString sobrescrito para fornecer uma representação legível do objeto Produto
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
