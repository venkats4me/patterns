package org.example;

public class Pattern_12 {
    public static void main(String[] args) {
        /*
       * * * * *
        * * * *
         * * *
          * *
           *
           *
          * *
         * * *
        * * * *
       * * * * *




         */

        int c=5;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < c; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int r=5;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {

                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
