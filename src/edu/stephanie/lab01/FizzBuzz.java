package edu.stephanie.lab01;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    fizzBuzz();
  }

/**
   * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
   * Se o número for apenas múltiplo de 3 -> "Fizz" ; 
   * Se o número for apenas múltiplo de 5 -> "Buzz"; 
   * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 
  */  
  public static void fizzBuzz() {
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    scanner.close();
    if(numero % 3 == 0){
      if(numero % 5 == 0){
        System.out.println("FizzBuzz");
      }else{
        System.out.println("Fizz");
      }
    }else if(numero % 5 == 0){
      System.out.println("Buzz");
    }else{
      System.out.println(numero);
    }
  }

}
