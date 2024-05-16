package main.set.pesquisa_contact;

import java.util.Objects;

public class Contato {
    private final String nome;
    private  int numero;

    // Construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(nome, contato.nome); // Apenas compara o nome
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome); // Usa apenas o nome para calcular o hash
    }

    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
                
    }
}
