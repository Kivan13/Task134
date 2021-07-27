
package dvodinniz;

import java.util.Arrays;

public class DvodinNiz {

    public static void main(String[] args) {
      int dniz1[]={1,2,3,4,5};
      int[]dniz2=new int[5];
      dniz2[0] = 1;
      dniz2[2]= 2;
      int matrica[][]={
          {1,2,3,4,5},
              {6,7,8,9},
              {10,11,12,13,14,15,16,17,18},
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
      };
      System.out.println(matrica[3][7]);
      Arrays.sort(matrica);
      System.out.println(matrica.length);
      
    }
    
}
