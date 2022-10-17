package edu.stephanie.aulas.POO;

public class Main {
  

  public static void main(String[] args) {
    Carro carro = new Carro();
    //atributos private; erro
    //System.out.println(carro.marca);
    //usando get
    String marca = carro.getMarca();
    System.out.println("Marca: "+marca);

    marca = "Fiat";
    carro.setMarca(marca);
    System.out.println("Marca: "+marca);

    carro.setCapacidadeTanque(20);
    double valorTanqueTotal = carro.valorTanqueTotal(6.25);
    System.out.println(valorTanqueTotal);
  }
}
