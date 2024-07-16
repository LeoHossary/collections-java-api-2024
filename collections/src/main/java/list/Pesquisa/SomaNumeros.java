package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numerosList;

  public SomaNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numerosList.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    if (!numerosList.isEmpty()) {
      for (Integer n : numerosList) {
        soma += n;
      }
    }
    return soma;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    if (!numerosList.isEmpty()) {
      for (Integer n : numerosList) {
        if (n > maiorNumero) {
          maiorNumero = n;
        }
      }
    }
    return maiorNumero;
  }

  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    if (!numerosList.isEmpty()) {
      for (Integer n : numerosList) {
        if (n < menorNumero) {
          menorNumero = n;
        }
      }
    }
    return menorNumero;
  }

  public void exibirNumeros() {
    System.out.println(numerosList);
  }

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.exibirNumeros();

    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(2);
    somaNumeros.adicionarNumero(8);
    somaNumeros.adicionarNumero(6);
    somaNumeros.adicionarNumero(11);
    somaNumeros.adicionarNumero(27);
    somaNumeros.adicionarNumero(100);

    somaNumeros.exibirNumeros();

    System.out.println("Soma total da lista de números: " + somaNumeros.calcularSoma());
    System.out.println("Maior número da lista: " + somaNumeros.encontrarMaiorNumero());
    System.out.println("Menor número da lista: " + somaNumeros.encontrarMenorNumero());
  }
}
