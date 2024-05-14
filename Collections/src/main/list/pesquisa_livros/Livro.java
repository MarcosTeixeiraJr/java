package main.list.pesquisa_livros;

public class Livro {
    //atributo

    private final String titulo;

    private final String autor;

    private final int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    @Override
    public String toString() {
        return "Livro{" +
        "titulo'" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        '}';
    }
}
