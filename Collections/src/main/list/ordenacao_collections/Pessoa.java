package main.list.ordenacao_collections;

import java.util.Comparator;

// Classe que representa uma Pessoa
public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private final String nome; // Nome da pessoa
    private final int idade; // Idade da pessoa
    private final double altura; // Altura da pessoa

    // Construtor para inicializar uma Pessoa com nome, idade e altura
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método compareTo para comparar Pessoas com base em sua idade
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    // Métodos para obter os atributos da Pessoa
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Método toString para representar a Pessoa como uma string
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

// Classe que implementa um comparador para comparar Pessoas por altura
class ComparatorPorAltura implements Comparator<Pessoa> {
    // Método compare para comparar duas Pessoas com base em sua altura
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

