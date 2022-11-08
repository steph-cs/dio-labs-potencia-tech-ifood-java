package edu.stephanie.aulas.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamApi {
  public static void main(String[] args) {
    Gato g1 = new Gato("Mel", 3, "tricolor");
    Gato g2 = new Gato("Forasteiro", 6, "preto");
    Gato g3 = new Gato("Remi", 2, "cinza");

    List<Gato> gatos = new ArrayList<>();
    gatos.add(g1);
    gatos.add(g2);
    gatos.add(g3);

    // ordem ComparatorNome
    System.out.println("Ordendao Nome:");

    // classe anonima
    gatos.sort(new Comparator<Gato>() {

      @Override
      public int compare(Gato g1, Gato g2) {
        return g1.getNome().compareToIgnoreCase(g2.getNome());
      }

    });

    gatos.sort(Comparator.comparing(new Function<Gato, String>() {

      @Override
      public String apply(Gato gato) {
        return gato.getNome();
      }
    }));

    // lambda
    gatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
    // reference method
    gatos.sort(Comparator.comparing(Gato::getNome));

    System.out.println(gatos.toString());
    
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
