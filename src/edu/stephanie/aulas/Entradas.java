package edu.stephanie.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Entradas {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite uma mensagem: ");
    String mensagem = scanner.nextLine();
    System.out.println(mensagem);
    scanner.close();

  }
}
