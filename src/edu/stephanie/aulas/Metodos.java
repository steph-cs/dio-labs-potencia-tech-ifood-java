package edu.stephanie.aulas;

public class Metodos {

  public static void main(String[] args) {
    double emprestimo = calcularEmprestimo(5000, 15);
    System.out.println(emprestimo);
  }

  public static int somar(int numero1, int numero2) {
    return numero1 + numero2;

  }

  public static String saudacoes(int hora) {
    /*
     * 06:00 - 11:59 bom dia
     * 12:00 - 17:59 boa tarde
     * 18:00 - 05:59 boa noite
     */
    String mensagem;
    if (hora >= 6 && hora <= 11) {
      mensagem = "Bom dia!";
    } else if (hora >= 12 && hora < 18) {
      mensagem = "Boa tarde!";
    } else {
      mensagem = "Boa noite!";
    }
    return mensagem;
  }

  public static double calcularEmprestimo(double emprestimo, int parcelas) {
    double taxa = 1 / 100d;
    double totalEmprestimo = 0d;
    if (parcelas <= 10) {
      taxa *= 5.20d;
    } else if (parcelas <= 20) {
      taxa *= 5.80d;
    } else {
      taxa *= 6.50d;
    }
    for (int i = 0; i < parcelas; i++) {
      if (i == 0) {
        totalEmprestimo += emprestimo + (emprestimo * taxa);
      }else{
        totalEmprestimo += totalEmprestimo + (totalEmprestimo * taxa);
      }
    }
    return totalEmprestimo;
  }

}
