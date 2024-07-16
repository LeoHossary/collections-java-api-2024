package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Numero> numerosList;

  public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numerosList.add(new Numero(numero));
  }

  public List<Numero> ordenarAscendente() {
    List<Numero> numerosAscendentesList = new ArrayList<>(numerosList);
    Collections.sort(numerosAscendentesList);
    return numerosAscendentesList;
  }  

  public List<Numero> ordenarDescendente() {
    List<Numero> numerosDescendentesList = new ArrayList<>(numerosList);
    Collections.sort(numerosDescendentesList);
    Collections.reverse(numerosDescendentesList);
    return numerosDescendentesList;
  }

  public static void main(String[] args) {
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    numeros.adicionarNumero(1);
    numeros.adicionarNumero(12);
    numeros.adicionarNumero(14);
    numeros.adicionarNumero(10);
    numeros.adicionarNumero(45);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(3);
    numeros.adicionarNumero(121);
    numeros.adicionarNumero(21);
    numeros.adicionarNumero(33);
    numeros.adicionarNumero(88);

    System.out.println(numeros.ordenarDescendente());
  }
}
