package org.example;

public class Pattern_6 {
    public static void main(String[] args) {
        /*
          *
         **
        ***
       ****
      *****
         */
        
        int c=5,r=5,ptc=0,ptr=4;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(ptc == i & ptr <= j ? "*" : " ");
            }
            ptc++;
            ptr--;
            System.out.println();
        }
        
    }
}
/*
 if(i>=ptc&&j>=ptr){
        System.out.print("*");
ptc++;
ptr--;
        }*/
