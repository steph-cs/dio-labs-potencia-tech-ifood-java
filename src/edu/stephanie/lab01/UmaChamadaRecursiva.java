package edu.stephanie.lab01;

import java.util.Scanner;

/**
 * UmaChamadaRecursiva
 * <p>
 * Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0. 
 */
public class UmaChamadaRecursiva {

  public static void main(String[] args) {
    somaRecursiva();
  }

  public static void somaRecursiva() {
    int numero, soma;
    Scanner scanner = new Scanner(System.in);
    numero = scanner.nextInt();
    scanner.close();
    soma = somatorio(numero);
    System.out.println(soma);

  }

  public static int somatorio(int numero) {
    if(numero == 0){
      return 0;
    }else{
      return numero + somatorio(numero - 1);
    }
  }
}