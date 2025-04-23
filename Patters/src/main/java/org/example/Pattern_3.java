package org.example;

public class Pattern_3 {
    public static void main(String[] args) {
    /*    *****
          ****
          ***
          **
          *

     */
        int r=5,c=5;

        for (int i = 0; i < c; i++) {
            for (int j = r; j >0; j--) {
                System.out.print("*");
            }
            r--;
            System.out.println();
        }
        System.out.println("=====logic 2======");
        for (int i = c; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
