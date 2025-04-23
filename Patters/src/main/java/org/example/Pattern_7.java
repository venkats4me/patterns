package org.example;

public class Pattern_7 {
    public static void main(String[] args) {
        /*
         *****
         ****
         ***
         **
         *
         */
        int c=5,r=5,stc=0,str=4;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(stc==i&str>=j?"*":" ");
            }
            stc++;
            str--;
            System.out.println();
        }
    }
}
