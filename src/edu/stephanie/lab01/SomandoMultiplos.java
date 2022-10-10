package edu.stephanie.lab01;

import java.util.Scanner;

/**
 * SomandoMultiplos
 * <p>
 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 */
public class SomandoMultiplos {
  
  public static void main(String[] args) {
    somarMultiplos();
  }

  public static void somarMultiplos() {
    int A, N;
    
    Scanner scanner = new Scanner(System.in);
    A = scanner.nextInt();
    N = scanner.nextInt();
    scanner.close();

    int soma = 0;
    int i = 1;
    int multiplicacao = 0;

    while(multiplicacao != N){
      multiplicacao = A * i;
      i++;
      soma += multiplicacao;
    }
   
    System.out.println(soma);
  }
}
