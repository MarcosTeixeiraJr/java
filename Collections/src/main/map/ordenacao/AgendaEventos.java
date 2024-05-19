package main.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    // Atributo para armazenar os eventos na agenda
    private Map<LocalDate, Evento> eventoMap;

    // Construtor da classe AgendaEventos
    public AgendaEventos() {
        this.eventoMap = new HashMap<>(); // Inicializa o mapa de eventos
    }

    // Método para adicionar um evento à agenda
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao); // Cria um novo evento com os dados fornecidos
        eventoMap.put(data, evento); // Adiciona o evento ao mapa, associado à data fornecida
    }

    // Método para exibir a agenda de eventos
    public void exibirAgenda() {
        // Cria um TreeMap ordenado pela data para exibir os eventos em ordem cronológica
        Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreemap); // Exibe o mapa de eventos ordenado
    }

    // Método para exibir o próximo evento na agenda
    public void proximoEvento() {
        LocalDate dataAtual = LocalDate.now(); // Obtém a data atual
        LocalDate proximaData = null; // Variável para armazenar a próxima data de evento
        Evento proximoEvento = null; // Variável para armazenar o próximo evento
        Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventoMap); // TreeMap para ordenar os eventos

        // Itera sobre o mapa de eventos para encontrar o próximo evento após a data atual
        for (Map.Entry<LocalDate, Evento> entry : eventoTreemap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                // Se a data do evento for igual ou posterior à data atual
                proximaData = entry.getKey(); // Armazena a próxima data de evento
                proximoEvento = entry.getValue(); // Armazena o próximo evento
                // Exibe informações sobre o próximo evento
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break; // Interrompe o loop após encontrar o próximo evento
            }
        }
    }

    // Método principal para testar a classe AgendaEventos
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos(); // Cria uma nova instância da classe AgendaEventos

        // Adiciona alguns eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 15), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 15), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda(); // Exibe a agenda de eventos
        agendaEventos.proximoEvento(); // Exibe o próximo evento na agenda
    }
}

