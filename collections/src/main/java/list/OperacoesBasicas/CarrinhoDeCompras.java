package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> carrinhoList;

  public CarrinhoDeCompras() {
    this.carrinhoList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    carrinhoList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();

    for (Item i : carrinhoList) {
      if(i.getNome().equalsIgnoreCase(nome)) {
        itensParaRemover.add(i);
      }
    }
    carrinhoList.removeAll(itensParaRemover);
  }

  public double calcularValorTotal() {
    double total = 0;

    for (Item i : carrinhoList) {
      total += (i.getPreco() * i.getQuantidade());
    }

    return total;
  }

  public void exibirItens() {
    System.out.println(carrinhoList);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    System.out.println("Valor total do carrinho: R$" + carrinhoDeCompras.calcularValorTotal());
    
    carrinhoDeCompras.adicionarItem("Arroz 5kg", 37.99, 1);
    carrinhoDeCompras.adicionarItem("produto 1", 10.50, 2);
    carrinhoDeCompras.adicionarItem("produto 2", 3.25, 2);
    System.out.println("Valor total do carrinho: R$" + carrinhoDeCompras.calcularValorTotal());

    carrinhoDeCompras.removerItem("produto 2");
    System.out.println("Valor total do carrinho: R$" + carrinhoDeCompras.calcularValorTotal());

    carrinhoDeCompras.exibirItens();
  }
}
