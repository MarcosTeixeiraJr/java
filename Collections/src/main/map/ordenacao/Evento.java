package main.map.ordenacao;

/**
 * Classe que representa um Evento com nome e atração.
 */
public class Evento {
    // Atributos privados para encapsulamento
    private String nome;
    private String atracao;

    /**
     * Construtor da classe Evento.
     *
     * @param nome O nome do evento
     * @param atracao A atração principal do evento
     */
    public Evento(String nome, String atracao) {
        this.nome = nome;  // Inicializa o atributo nome com o valor fornecido
        this.atracao = atracao;  // Inicializa o atributo atracao com o valor fornecido
    }

    /**
     * Método getter para obter o nome do evento.
     *
     * @return O nome do evento
     */
    public String getNome() {
        return nome;  // Retorna o valor do atributo nome
    }

    /**
     * Método getter para obter a atração do evento.
     *
     * @return A atração do evento
     */
    public String getAtracao() {
        return atracao;  // Retorna o valor do atributo atracao
    }

    /**
     * Método toString para representar o objeto Evento como uma string.
     *
     * @return A representação textual do evento
     */
    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao=" + atracao +
                '}';  // Retorna uma string que representa o objeto Evento
    }
}

