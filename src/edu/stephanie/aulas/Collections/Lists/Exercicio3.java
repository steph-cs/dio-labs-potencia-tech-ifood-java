package edu.stephanie.aulas.Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio3 {
  
  public static void main(String[] args) {
    Gato g1 = new Gato("Mel", 3, "tricolor");
    Gato g2 = new Gato("Forasteiro", 6, "preto");
    Gato g3 = new Gato("Remi", 2, "cinza");

    List<Gato> gatos = new ArrayList<>();
    gatos.add(g1);
    gatos.add(g2);
    gatos.add(g3);

    //ordem insercao
    System.out.println(gatos.toString());
    
    //ordem aleatoria
    Collections.shuffle(gatos);
    System.out.println(gatos.toString());

    //ordem compareTo dentro da classe por nome
    Collections.sort(gatos);
    System.out.println(gatos.toString());

    //ordem ComparatorNome
    System.out.println("Ordendao Nome:");
    gatos.sort(new ComparatorNome());
    System.out.println(gatos.toString());

    //ordem ComparatorIdade
    System.out.println("Ordendao Idade:");
    gatos.sort(new ComparatorIdade());
    System.out.println(gatos.toString());

    //ordem ComparatorCor
    System.out.println("Ordendao Cor:");
    gatos.sort(new ComparatorCor());
    System.out.println(gatos.toString());

  }
}

/**
 * ComparatorNome
 */
class ComparatorNome implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
    return g1.getNome().compareToIgnoreCase(g2.getNome());
  }

}

class ComparatorIdade implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(),g2.getIdade());
  }

}

class ComparatorCor implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
    return g1.getCor().compareToIgnoreCase(g2.getCor());
  }

}

/**
 * Gato
 */
class Gato implements Comparable<Gato> {

  String nome;
  Integer idade;
  String cor;

  public Gato(String nome, int idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;

  }
  public String getNome() {
    return nome;
  }
  public Integer getIdade() {
    return idade;
  }
  public String getCor() {
    return cor;
  }

  @Override
  public String toString() {
    return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
  }

  @Override
  public int compareTo(Gato o) {
    return this.getNome().compareToIgnoreCase(o.getNome());
  }
 
  
}
