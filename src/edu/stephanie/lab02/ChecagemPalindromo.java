package edu.stephanie.lab02;

import java.util.Scanner;

public class ChecagemPalindromo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String palavra = sc.nextLine();
    String palavraInvertida = "";

    for(int i = palavra.length() ; i != 0; i--){
      palavraInvertida += palavra.charAt(i -1);
    }
    boolean igual = palavra.equalsIgnoreCase(palavraInvertida);
    System.out.println(String.valueOf(igual).toUpperCase());
    sc.close();
  }

}
