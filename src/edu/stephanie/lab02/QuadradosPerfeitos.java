package edu.stephanie.lab02;

public class QuadradosPerfeitos {
  public static void main(String[] args) {
    int d = 12;
    int d1 = d;
    int n = 0;
    int res = d;

    for(int j = d/2 ; j > 0 ; j --){
      int i = j;
      while(i>0){
        if (i * i <= d && (d1 - i * i >= 0)) {
          d1 -= i * i;
          n++;
        }else{
          i--;
        }
      }
      if (n <= res){
        res = n;
      };
      
      d1 = d;
      n = 0;
    }

    System.out.println("d1: " + d1);
    System.out.println("n vezes: " + res);
  }
}
