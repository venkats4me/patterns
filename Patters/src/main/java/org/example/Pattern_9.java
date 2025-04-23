package org.example;

public class Pattern_9 {
    public static void main(String[] args) {
        /*
         *********
          *******
           *****
            ***
             *
         */
        int c=5,r=9,s=1;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j <s; j++) {
                System.out.print(" ");
            } for (int j = 0; j < r; j++) {
                System.out.print("*");
            }
            s++;
            r-=2;
            System.out.println();
        }
    }
}
