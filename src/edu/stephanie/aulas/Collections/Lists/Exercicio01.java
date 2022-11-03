package edu.stephanie.aulas.Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

  public static void main(String[] args) {
    List<Integer> temperaturasMes = new ArrayList<>();
    temperaturasMes.add(0, 26);
    temperaturasMes.add(1, 32);
    temperaturasMes.add(2, 16);
    temperaturasMes.add(3, 21);
    temperaturasMes.add(4, 24);
    temperaturasMes.add(5, 26);

  }

  public static int calculaMediaSemestral(List<Integer> temperaturas) {
    int media = 0;
    for (Integer temp : temperaturas) {
      media += temp;
    }
    media /= temperaturas.size();
    return media;
  }

  public static void mesesAcimaMedia(List<Integer> temperaturas) {
    String mes;
    int media = calculaMediaSemestral(temperaturas);
    System.out.println("Media: " + media);
    for (int i = 0; i < temperaturas.size(); i++) {
      int temp = temperaturas.get(i);
      if (temp >= media) {
        mes = getMes(i);
        System.out.println("Mes: " + mes + " Temp: " + temp);
      }
    }
  }

  public static String getMes(int indexMes) {
    String mes = "";
    switch (indexMes) {
      case 0:
        mes = "Janeiro";
        break;
      case 1:
        mes = "Fevereiro";
        break;
      case 2:
        mes = "Março";
        break;
      case 3:
        mes = "Abril";
        break;
      case 4:
        mes = "Maio";
        break;
      case 5:
        mes = "Junho";
        break;
    }
    return mes;
  }
}
