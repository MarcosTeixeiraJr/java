package main.list.operacoes_basicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    // Atributo
    private final List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Método para remover uma tarefa com base na descrição
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método para obter o número total de tarefas na lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Método para imprimir todas as tarefas na lista
    public void imprimirTarefas() {
        for (Tarefa t : tarefaList) {
            System.out.println(t);
        }
    }

    // Método main para teste
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.imprimirTarefas();
    }
}
