package edu.stephanie.aulas.estruturasRepeticao;

import java.util.Scanner;

public class Loop {
  
  public static void main(String[] args) {
    //pedirNota();
    //pedirLogin();
    
  }


  /**
   * Programa pede uma nota, entre zero e dez. Mostra uma mensagem caso o valor seja inválido e continua pedindo até que o usuário informe um valor válido.
   * <ul>
   * <li>nota: nota informada pelo usuario
   * <li>notaValida: nota entre 0 e 10
   * </ul>
   * @return nota valida digitada
   */
  public static void pedirNota() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Digite uma nota entre 0 e 10: ");
      int nota = scanner.nextInt();
      boolean notaValida = nota <= 10 && nota > 0;
      if(notaValida){
        System.out.println("Nota valida!");
        break;
      }else{
        System.out.println("Nota invalida! Digite uma nota valida");
      }
    }
    scanner.close();
  }


  /**
   * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
   */
  public static void pedirLogin() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Nome de usuario: ");
      String nomeUsuario = scanner.next();

      System.out.print("Senha de usuario: ");
      String senhaUsuario = scanner.next();
      
      boolean loginInvalido = nomeUsuario.equalsIgnoreCase(senhaUsuario);
    
      if(!loginInvalido){
        System.out.println("Login valido!");
        break;
      }else{
        System.out.println("Login invalido!");
      }
    }
    scanner.close();
  }

 
}
