/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;

import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class ejer17 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        int matriz[][]=new int[3][3];
        int columna;
        int fila;
        
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=0;
                System.out.print(matriz[i][j] + " ");
            }System.out.println("");
        }
        int x=2;
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                System.out.println("turno del jugador 1");
            }else{
                System.out.println("turno del jugador 2");
            }
                    System.out.println("escriba la columna donde pondra el valor");
                    columna=entrada.nextInt();
                    columna--;
                    System.out.println("escriba la fila donde pondra el valor");
                    fila=entrada.nextInt();
                    fila--;
                    System.out.println("escriba el valor en la posicion");
                    matriz[fila][columna]=entrada.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(matriz[j][k] + " ");
                }System.out.println("");
            }
        }
    }
}
