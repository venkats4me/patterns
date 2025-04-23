package org.example;

public class Pattern_13 {
    public static void main(String[] args) {
        /*

          *
         * *
        *   *
       *     *
      *********

         */
        int c=5;
        for (int i = 0; i <=c; i++) {
            for (int j = i; j < c; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1; j++) {
                System.out.print(j%i==0?" ":"*");
            }
            System.out.println();
        }
    }
}
