package main.list.ordenacao_collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Classe responsável por ordenar objetos Pessoa
public class OrdenacaoPessoa {
    // Atributo para armazenar a lista de pessoas
    private final List<Pessoa> pessoaList;

    // Construtor da classe
    public OrdenacaoPessoa() {
        // Inicializa a lista de pessoas como um ArrayList vazio
        this.pessoaList = new ArrayList<>();
    }

    // Método para adicionar uma nova pessoa à lista
    public void adicionarPessoa(String nome, int idade, double altura) {
        // Cria uma nova instância de Pessoa com os parâmetros fornecidos e a adiciona à lista
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Método para ordenar a lista de pessoas por idade e retornar uma nova lista ordenada
    public List<Pessoa> ordenarPorIdade() {
        // Cria uma cópia da lista de pessoas para não modificar a lista original
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        // Usa o método sort() da classe Collections para ordenar a lista usando a ordem natural (compareTo)
        Collections.sort(pessoasPorIdade);
        // Retorna a lista ordenada
        return pessoasPorIdade;
    }

    // Método para ordenar a lista de pessoas por altura e retornar uma nova lista ordenada
    public List<Pessoa> ordenarPorAltura() {
        // Cria uma cópia da lista de pessoas para não modificar a lista original
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        // Usa o método sort() da classe Collections para ordenar a lista usando um comparador personalizado
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        // Retorna a lista ordenada
        return pessoasPorAltura;
    }

    // Método principal para testar a funcionalidade da classe
    public static void main(String[] args) {
        // Cria uma instância de OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adiciona algumas pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        // Testa a ordenação por idade e exibe o resultado
        System.out.println("Ordenado por idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        // Testa a ordenação por altura e exibe o resultado
        System.out.println("Ordenado por altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

