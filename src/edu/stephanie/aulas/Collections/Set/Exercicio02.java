package edu.stephanie.aulas.Collections.Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio02 {

  public static void main(String[] args) {

    LinguagemFavorita l1 = new LinguagemFavorita("python", 1991, "vscode");
    LinguagemFavorita l2 = new LinguagemFavorita("java", 1995, "vscode");
    LinguagemFavorita l3 = new LinguagemFavorita("kotlin", 2011, "android-studio");
    LinguagemFavorita l4 = new LinguagemFavorita("javaScript", 1995, "vscode");

    // ordem insercao
    Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
    linguagens.add(l1);
    linguagens.add(l2);
    linguagens.add(l3);
    linguagens.add(l4);
    System.out.println("ordem insercao:");
    System.out.println(linguagens.toString() + "\n");

    // ordem natural (nome)
    Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
    System.out.println("ordem natural:");
    System.out.println(linguagens2.toString() + "\n");

    // ide
    List<LinguagemFavorita> linguagens3 = new ArrayList<>(linguagens2);
    linguagens3.sort(new ComparatorIde());
    System.out.println("ide:");
    System.out.println(linguagens3.toString() + "\n");

    // ano criacao e nome,
    linguagens3.sort(new ComparatorAnoCriacaoNome());
    System.out.println("ano e nome:");
    System.out.println(linguagens3.toString() + "\n");

    // ano, ide e nome
    linguagens3.sort(new ComparatorAnoCriacaoIdeNome());
    System.out.println("ano, ide e nome:");
    System.out.println(linguagens3.toString() + "\n");

  }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
  String nome;
  Integer anoCriacao;
  String ide;

  public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
    this.nome = nome;
    this.anoCriacao = anoCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public Integer getAnoCriacao() {
    return anoCriacao;
  }

  public String getIde() {
    return ide;
  }

  @Override
  public int compareTo(LinguagemFavorita l2) {
    return this.getNome().compareToIgnoreCase(l2.getNome());
  }

  @Override
  public String toString() {
    return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
  }

}

class ComparatorIde implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    return l1.getIde().compareToIgnoreCase(l2.getIde());
  }

}

class ComparatorAnoCriacao implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
  }

}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    if (l1.getAnoCriacao() == l2.getAnoCriacao()) {
      return l1.getNome().compareToIgnoreCase(l2.getNome());
    } else {
      return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
    }

  }

}

class ComparatorAnoCriacaoIdeNome implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    // ano igual
    if (l1.getAnoCriacao() == l2.getAnoCriacao()) {
      // ide igual
      if (l1.getIde().toUpperCase() == l2.getIde().toUpperCase()) {
        // ano e ide igual; compara por nome
        return l1.getNome().compareToIgnoreCase(l2.getNome());
      } else {
        // ano igual; ide diferente; compara por ide
        return l1.getIde().compareToIgnoreCase(l2.getIde());
      }
    } else {
      // ano diferente; compara por ano
      return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
    }

  }

}