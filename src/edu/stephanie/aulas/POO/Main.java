package edu.stephanie.aulas.POO;

public class Main {
  

  public static void main(String[] args) {
    Carro carro = new Carro();
    //atributos private; erro
    //System.out.println(carro.marca);
    //usando get
    System.out.println("Marca: "+ carro.getMarca());

    carro.setMarca("Fiat");
    System.out.println("Marca: "+ carro.getMarca());

    carro.setCapacidadeTanque(20);
    double valorTanqueTotal = carro.valorTanqueTotal(6.25);
    System.out.println(valorTanqueTotal);

    //carro herda metodos de veiculo
    carro.setPlaca("FLN2450");
    System.out.println("Placa: "+ carro.getPlaca());
  }
}
