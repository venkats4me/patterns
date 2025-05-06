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
            for (int k = 0; k <2*i-1; k++) {
                    System.out.print((k==0||k==2*i-2||i==c)?"*":" ");
            }
            System.out.println();
        }

    }
}
