package edu.stephanie.aulas.Collections.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Exercicio01 {

  public static void main(String[] args) {

    Map<String, Integer> populacoes = new HashMap<>();
    populacoes.put("PE", 9616621);
    populacoes.put("AL", 3351543);
    populacoes.put("CE", 9187103);
    populacoes.put("RN", 3534265);

    System.out.println(populacoes.toString());

    // substitui populacao de RN
    populacoes.put("RN", 3534165);

    // verifica se contem PB, se n adiciona ao dic
    if (!populacoes.containsKey("PB")) {
      populacoes.put("PB", 4039277);
    }
    System.out.println(populacoes.toString());

    // populacao PE
    System.out.println("Populacao PE: " + populacoes.get("PE"));

    Map<String, Integer> populacoes2 = new LinkedHashMap<>();
    populacoes2.put("PE", 9616621);
    populacoes2.put("AL", 3351543);
    populacoes2.put("CE", 9187103);
    populacoes2.put("RN", 3534265);
    // linked hah map, oredem insercao
    System.out.println("Linked Hash Map:");
    System.out.println(populacoes2.toString());

    Map<String, Integer> populacoes3 = new TreeMap<>(populacoes2);
    // ordem alfabetica
    System.out.println("Tree Map:");
    System.out.println(populacoes3.toString());

    // menor populacao
    Collection<Integer> values = populacoes.values();
    Integer min_populacao = Collections.min(values);
    for (Entry<String, Integer> entry : populacoes.entrySet()) {
      if (entry.getValue() == min_populacao) {
        System.out.println("Estado min_populacao: " + entry.getKey());
      }
    }

    // maior populacao
    Integer max_populacao = Collections.max(values);
    for (Entry<String, Integer> entry : populacoes.entrySet()) {
      if (entry.getValue() == max_populacao) {
        System.out.println("Estado max_populacao: " + entry.getKey());
      }
    }

    // soma e media populacoes
    Integer tam_dicionario = populacoes.size();
    Integer media = 0;
    for (Integer pop : values) {
      media += pop;
    }
    System.out.println("Soma populacoes: " + media);
    media /= tam_dicionario;
    System.out.println("Media populacoes: " + media);

    // remover populacoes < 4.000.000
    Iterator<Integer> iterator = values.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() < 4000000)
        iterator.remove();
    }
    System.out.println("Removido pop < 4.000.000:");
    System.out.println(populacoes);

    // apagar dic
    populacoes.clear();
    if (populacoes.isEmpty())
      System.out.println("Dicionario vazio!");
  }

}
