package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    // Set<LocalDate> dateSet = eventosMap.keySet();
    // Collection<Evento> values = eventosMap.values();

    // eventosMap.get();

    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;

    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração A");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 25), "Evento 2", "Atração B");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 25), "Evento 3", "Atração C");
    agendaEventos.adicionarEvento(LocalDate.of(2020, 3, 30), "Evento 4", "Atração D");
    // agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 12), "Hoje", "Atração E");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 13), "Amanhã", "Atração F");


    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();
  }
}
