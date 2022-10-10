package edu.stephanie.lab01;

import java.util.Scanner;

public class BuscaSequencial {
  
  public static void main(String[] args) {
    buscaSequencial();
  }
/**
 * Buscar o elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X
 */
  public static void buscaSequencial() {
    Scanner scanner = new Scanner(System.in);
    int numeroBusca = scanner.nextInt();
    scanner.close();

    int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
    boolean encontrado = false;
    for(int i = 0; i < elementos.length ; i++){
      if (elementos[i] == numeroBusca){
        System.out.println("Achei "+ numeroBusca+ " na posicao "+ i);
        encontrado = true;
      }
    }
    if(!encontrado){
      System.out.println("Numero "+ numeroBusca+ " nao encontrado!");
    }
  }
}
