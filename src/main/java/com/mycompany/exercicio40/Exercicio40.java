

package com.mycompany.exercicio40;


public class Exercicio40 {

    public static void main(String[] args) {
        
        int numeros[] = new int[10];
        
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        try{
        System.out.println("Tentando mostrar indice 10:" + numeros[10]);
        } catch(java.lang.ArrayIndexOutOfBoundsException e) {
            
        }
        
        
    }
}
