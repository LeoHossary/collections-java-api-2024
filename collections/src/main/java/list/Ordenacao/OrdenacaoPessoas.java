package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.list.Ordenacao.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoas {
  private List<Pessoa> pessoasList;

  public OrdenacaoPessoas() {
    this.pessoasList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoasList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("pessoa 1", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("pessao 2", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("pessoa 3", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("pessoa 4", 17, 1.56);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
