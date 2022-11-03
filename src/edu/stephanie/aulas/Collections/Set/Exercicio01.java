package edu.stephanie.aulas.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio01 {

  public static void main(String[] args) {

    Set<String> arcoIris = new HashSet<>();
    arcoIris.add("vermelho");
    arcoIris.add("laranja");
    arcoIris.add("amarelo");
    arcoIris.add("verde");
    arcoIris.add("azul");
    arcoIris.add("anil");
    arcoIris.add("violeta");

    // arco iris
    System.out.println(arcoIris.toString());

    // ordem alfabetica
    Set<String> arcoIris2 = new TreeSet<>(arcoIris);
    System.out.println(arcoIris2.toString());

    // quantidade de cores
    System.out.println("\nTamanho: " + arcoIris.size());

    Set<String> arcoIris3 = new LinkedHashSet<>();
    arcoIris3.add("vermelho");
    arcoIris3.add("laranja");
    arcoIris3.add("amarelo");
    arcoIris3.add("verde");
    arcoIris3.add("azul");
    arcoIris3.add("anil");
    arcoIris3.add("violeta");
    System.out.println("Linked hash set:");
    System.out.println(arcoIris3.toString());

    // cores q comecam com v
    System.out.println("\nCores que comecam com V:");
    for (String cor : arcoIris2) {
      if (cor.toUpperCase().startsWith("V"))
        System.out.println(cor);
    }

    // remove cores q n comecam com v
    System.out.println("\nCores removidas:");

    Iterator<String> itCores = arcoIris2.iterator();
    while (itCores.hasNext()) {
      String cor = itCores.next();
      if (!cor.toUpperCase().startsWith("V")) {
        itCores.remove();
        System.out.println(cor);
      }
    }
    // limpar conjunto
    System.out.println("\nLimpando conjunto...");
    arcoIris2.clear();
    System.out.println("Vazio: " + arcoIris2.isEmpty());

  }
}
