package edu.stephanie.aulas.Collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
  
  public static void main(String[] args) {
    
    interrogarCrime();
    
  }

  public static void interrogarCrime() {
    Scanner scanner = new Scanner(System.in);
    List<Boolean> respostas = new ArrayList<>();
    System.out.println("Responda com TRUE ou FALSE");
    for(int i = 0; i < 5; i++){
      System.out.println("Pergunta "+ (i+1)+ ":");
      respostas.add(scanner.nextBoolean());
    }
    int respostasSuspeitas = contarRespostasSuspeitas(respostas);
    String classificacao =  getClassificao(respostasSuspeitas);

    System.out.println("Respostas suspeitas: " + respostasSuspeitas);
    System.out.println("Classificacao: " + classificacao);

    scanner.close();
  }

  public static int contarRespostasSuspeitas(List<Boolean> respostas) {
    int countTrue = 0;
    for (Boolean resposta : respostas) {
      if(resposta){
        countTrue++;
      }
    }
    return countTrue;
  }

  public static String getClassificao(int countTrue) {
    String classificacao = "";
    switch (countTrue) {
      case 0:
      case 1:
        classificacao = "Inocente";
        break;
      case 2:
        classificacao = "Suspeita";
        break;
      case 3:
      case 4:
        classificacao = "Cumplice";
        break;
      case 5:
        classificacao = "Assassina";
        break;
    }
    return classificacao;
  }
}
  