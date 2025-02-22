package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
  }

  public void removerPalavra(String palavra) {
    if (!palavrasUnicasSet.isEmpty()) {
      String palavraParaRemover = null;
      for (String p : palavrasUnicasSet) {
        if (p == palavra) {
          palavraParaRemover = p;
          break;
        }
      }
      palavrasUnicasSet.remove(palavraParaRemover);
    }
  }

  public boolean verificarPalavra(String palavra){
    return palavrasUnicasSet.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    System.out.println(palavrasUnicasSet);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("celular");
    conjuntoPalavrasUnicas.adicionarPalavra("computador");
    conjuntoPalavrasUnicas.adicionarPalavra("lâmpada");
    conjuntoPalavrasUnicas.adicionarPalavra("garrafa");
    conjuntoPalavrasUnicas.adicionarPalavra("estojo");
    conjuntoPalavrasUnicas.adicionarPalavra("fone");


    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    
    conjuntoPalavrasUnicas.removerPalavra("celular");
    
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
  }
}
