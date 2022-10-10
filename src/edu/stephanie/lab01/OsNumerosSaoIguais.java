package edu.stephanie.lab01;

import java.util.Scanner;

/**
 * OsNumerosSaoIguais
 * <p>
 * Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
 */
public class OsNumerosSaoIguais {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();
    scanner.close();
    if(numero1 == numero2){
      System.out.println("Sao iguais!");
    }else{
      System.out.println("Nao sao iguais!");
    }
  }
}
