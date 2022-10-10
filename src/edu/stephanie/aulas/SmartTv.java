package edu.stephanie.aulas;

public class SmartTv {
  
  boolean ligada = false;
  int canal = 5;
  int volume = 20;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++ ;
  }

  public void diminuirVolume() {
    volume-- ;
  }

  /**
   * Mudar para um numero de canal especifico
   * @param novoCanal numero novo canal da Smart Tv
   */
  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }
  
  /**
   * Aumenta um canal da Smart Tv
   */
  public void aumentarCanal() {
    canal++ ;
  }

  /**
   * Diminui um canal da Smart Tv
   */
  public void diminuirCanal() {
    canal++ ;
  }

  /**
   * Status dos atributos da Smart Tv
   */
  public void status() {
    System.out.println("\nLigada: " + ligada);
    System.out.println("Canal: " + canal);
    System.out.println("Volume: " + volume);

  }

  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
  
    smartTv.status();

    smartTv.ligar();
    if(smartTv.ligada){
      for(int i = 0 ; i < 5 ; i++){
        smartTv.aumentarVolume();
      }
      smartTv.mudarCanal(12);
    }else{
      System.out.println("Smart TV desligada!");
    }
   
    smartTv.status();

  }
}
