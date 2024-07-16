package main.java.list.Ordenacao;

public class Numero implements Comparable<Numero>{
  private int valor;

  public Numero(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "" + valor;
  }

  @Override
  public int compareTo(Numero n) {
    if (this.valor < n.valor) {
      return -1;
    }
    if (this.valor > n.valor) {
      return 1;
    }
    return 0;
  }

  
}
