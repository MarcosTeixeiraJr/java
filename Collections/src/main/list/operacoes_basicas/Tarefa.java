package main.list.operacoes_basicas;

public class Tarefa {
    // Atributo
    private final String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Sobrescrevendo o método toString para fornecer uma representação de string da tarefa
    @Override
    public String toString() {
        return descricao;
    }
}

