package ejercicios_taller2;

import java.util.Scanner;

public class ejer7 {
    static Scanner entrada= new Scanner (System.in);
    public static void main(String[] args) {
        
        int matriz[][]=new int[4][4];
        int [][] vector2= new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }System.out.println("");
        }
        
        System.out.println("escoja la columna que quiere intercambiar");
        int columna=entrada.nextInt();
        columna--;
        
        System.out.println("escoja la fila con la que intercambiara la columna");
        int fila=entrada.nextInt();
        fila--;
         
        for (int i = 0; i < 4; i++) {
            for (int j =0 ; j < 4; j++) {
                
                if(columna==i && fila==j){
                    for (int k = columna; k <= columna; k++) {
                        for (int l = 0; l < 4; l++) {
                            vector2[k][l]=matriz[k][l];
                            
                                                     
                        }                                        
                    }
                    System.out.println("");
                }
               
                if(columna==i && fila==j){
                   
                    for (int k = columna; k <= columna; k++) {
                        for (int l = 0; l < 4; l++) {
                            
                           
                            vector2[k][l]=matriz[k][l];
                            
                            
                        }
                    }
                }
                
                System.out.print(matriz[i][j] +" ");
                  
                
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
    

