package edu.stephanie.estruturasRepeticao;

import java.util.Scanner;

public class Arrays {
  
  public static void main(String[] args) {
    consoantes();
  }
/**
 * Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
*/
  public static void consoantes() {
    
    Scanner scanner = new Scanner(System.in);
    String[] consoantes = new String [6];

    //preenche array
    for(int i = 0 ; i < 6; i++){
      System.out.print("Letra: ");
      String letra = scanner.next();
      consoantes[i] = letra;
    }

    //verifica consoantes
    int totalConsoantes = 0;
    String[] vogais = {"a", "e" , "i" , "o", "u"};
    
    System.out.print("Consoantes: ");
    for (String letra : consoantes) {
      boolean consoante = true;
      
      for (String vogal : vogais) {
        if(letra.equalsIgnoreCase(vogal)){
          consoante = false;
          break;
        }
      }
      if(consoante){
        totalConsoantes++;
        System.out.print(letra + " ");
      }
    }
    scanner.close();
    System.out.println("\nTotal consoantes: " + totalConsoantes);
  }

/**
 * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */
  public static void numerosSucessores() {
    
  }
}
