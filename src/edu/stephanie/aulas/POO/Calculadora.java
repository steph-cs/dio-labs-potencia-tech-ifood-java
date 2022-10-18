package edu.stephanie.aulas.POO;

public class Calculadora implements Operacoes {

  @Override
  public void somar(int n1, int n2) {
    int soma =  n1 + n2;
    System.out.println("Soma = " + soma);
    
  }

  @Override
  public void subtrair(int n1, int n2) {
    int subtracao =  n1 + n2;
    System.out.println("Subtracao = " + subtracao);
    
  }
  
}
