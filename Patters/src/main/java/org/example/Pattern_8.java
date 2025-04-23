package org.example;

public class Pattern_8 {
    public static void main(String[] args) {
        /*
          *
         ***
        *****
       *******
      *********
====================
          *
         ***
        *****
       *******
      *********
         */

        int c=5,r=1,s=5;
        for (int i = 0; i < c; i++) {
                for (int k =s; k >=1 ; k--) {
                    System.out.print(" ");
                }
            for (int j = 0; j < r; j++) {
                System.out.print("*");
            }
            r+=2;
            s--;
            System.out.println();
        }
    }
}
