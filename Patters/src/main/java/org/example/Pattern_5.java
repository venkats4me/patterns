package org.example;

public class Pattern_5 {
    public static void main(String[] args) {
        /*
        
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         
         */
        
        int r=5,c=5;
        boolean flg=false;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i<5){
                System.out.print("*");}
                if(i==5){
                    for (int l = r; l >=1 ; l--) {
                        for (int k = 1; k <=l; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }

            }
            System.out.println();
        }
        System.out.println("====logic 2========");
        for (int i = 0; i <c ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = c; i >0 ; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
