
package ejercicios_taller2;

import java.util.Scanner;


public class VectoresYMetrices {

    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        int mayor=10;
        int menor=0;
        
        int vector[]=new int[10];
        for (int x=0;x<vector.length;x++) {
            System.out.println("rellene el vector numero " + (x+1));
            vector[x]=entrada.nextInt();
            
        }
        for(int fila1:vector){
           
           if(fila1%2==0){
               
               System.out.println("el numero es par " + fila1);
               
           }
           if(fila1>mayor){
               mayor=fila1;
           }
           if(fila1<menor){
               menor=fila1;
           }
           
           
           
        }
        System.out.println("el numero mayor es " + mayor);
        System.out.println("el numero menor es " + menor);
        
    }
    
}
