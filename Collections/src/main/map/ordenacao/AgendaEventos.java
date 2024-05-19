package main.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreemap);
    }

    public void proximoEvento() {
        //Set<LocalDate> dateSet = eventoMap.keySet();
        //Collection<Evento> value = eventoMap.values();
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreemap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecera na data " + proximaData);
                break;
            }
        }

    }

    public static void main (String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7,9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1,15), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6,15), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();

        agendaEventos.proximoEvento();


    }
}
