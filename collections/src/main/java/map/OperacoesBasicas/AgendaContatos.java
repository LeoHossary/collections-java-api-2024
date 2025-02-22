package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Leonardo", 123456);
    agendaContatos.adicionarContato("Leonardo", 56665);
    agendaContatos.adicionarContato("Leonardo Hossary", 11111111);
    agendaContatos.adicionarContato("Leonardo DIO", 654987);
    agendaContatos.adicionarContato("Tiago Hossary", 11111111);
    agendaContatos.adicionarContato("Leonardo", 44444);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Tiago Hossary");

    agendaContatos.exibirContatos();

    System.out.println("O número do contato é: " + agendaContatos.pesquisarPorNome("Leonardo DIO"));
  }
}
