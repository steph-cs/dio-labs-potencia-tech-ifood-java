package edu.stephanie.lab02;

import java.util.Scanner;

public class FatorialDesajeitado {

  public static void main(String[] args) {
    int n = Integer.parseInt(new Scanner(System.in).nextLine());
    int res = 0;
    int cnt = 1;
    int tmp = n;
    
    n--;
    while (n > 0) {
      switch (cnt) {
        case 1:
          //multiplica
          tmp *=  n;
          break;
        case 2:
          //divide
          tmp /= n;
          break;
        case 3:
          //soma
          tmp += n;
          res += tmp;
          break;
        case 4:
          //subtrai
          tmp = -n;
          break;
      }
      n--;
      if(cnt == 4){
        cnt = 1;
      }else{
        cnt++;
      }
      
    }
    if(cnt < 4){
      res += tmp;
    }
    
    System.out.println(res);
  }

}
