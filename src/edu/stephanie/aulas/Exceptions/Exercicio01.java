package edu.stephanie.aulas.Exceptions;

public class Exercicio01 {

  public static void main(String[] args) {
    String n1, n2;
    n1 = "20";
    n2 = "4";

    try {
      int n3 = Integer.parseInt(n1);
      int n4 = Integer.parseInt(n2);
      System.out.println("Divisao = " + n3 / n4);
    } catch (NumberFormatException e) {
      System.out.println("Execption "+e.getMessage());
    } catch (ArithmeticException e){
      System.out.println("Divisao por 0! " + e.getMessage());
    } 
    finally{
      System.out.println("Acabou!");
    }
    
    if(5>2){
      throw new ArithmeticException("5 é maior que 2");
    }

  }

}
