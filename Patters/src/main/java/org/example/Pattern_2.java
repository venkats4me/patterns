package org.example;

public class Pattern_2 {
    public static void main(String[] args) {
   /*
    *
    **
    ***
    ****
    *****
    */
   int c=5,r=5;
        for (int i = 0; i<=c; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
