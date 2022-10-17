package edu.stephanie.aulas.POO;

public class Carro {
  private int ano;
  private double capacidadeTanque;
  private String cor, marca;

  Carro() {

  }

  Carro( String cor, String marca, int ano, double capacidadeTanque){
    this.cor = cor;
    this.marca = marca;
    this.ano = ano;
    this.capacidadeTanque = capacidadeTanque;
  }


  public double valorTanqueTotal(double valorCombustivel) {
    return getCapacidadeTanque() * valorCombustivel;
  }

  public int getAno() {
    return ano;
  }

  public double getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public String getCor() {
    return cor;
  }

  public String getMarca() {
    return marca;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setCapacidadeTanque(double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

}
