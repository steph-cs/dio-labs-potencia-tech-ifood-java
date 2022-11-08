package edu.stephanie.lab02;

import java.util.Scanner;

public class ValidacaoParenteses {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean caracter = ehValido(scanner.nextLine());

    System.out.println(caracter);
    scanner.close();
  }

  public static boolean ehValido(String s) {
    // implemente a lógica de caracteres válidos e retorne se a string é
    // valida ou não.
    boolean valido = false;
    if(s.isEmpty()){
      valido = true;
    }else{
     
      String[] s1 = s.split("");
      String caracter = s1[0];

      switch(caracter){
        case "[" : {
          valido = s1[s.length() -1 ].equals("]");
          break;
        }
        case "(" : {
          valido = s1[s.length() -1 ].equals(")");
          break;
        }
        case "{" : {
          valido = s1[s.length() -1 ].equals("}");
          break;
        }
      }
    } 
    return valido;
  }

}
