package main.list.pesquisa_livros;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um catálogo de livros
public class CatalagoLivros {
    // Atributo para armazenar a lista de livros
    private final List<Livro> livroList;

    // Construtor da classe
    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    // Método para adicionar um novo livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Método para pesquisar livros por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // Método para pesquisar livros por intervalo de anos de publicação
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Método para pesquisar um livro por título
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    // Método principal para testar a funcionalidade da classe
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        
        // Adiciona alguns livros ao catálogo
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        // Testa as operações de pesquisa e exibe os resultados
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));
    }
}

