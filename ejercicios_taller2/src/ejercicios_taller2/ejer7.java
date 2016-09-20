package ejercicios_taller2;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        int matriz[][]= new int[4][4];
        int fila1[]=new int[4];
        int fila2[]=new int[4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }System.out.println("");
        }
        
        System.out.println("escoja una fila");
        int fila=entrada.nextInt();
        fila--;
        System.out.println("escoja una columna");
        int colum=entrada.nextInt();
        colum--;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                //metemos la fila en un vector
                
                if(i==fila){
                    fila1[j]=matriz[i][j];
                    
                    
                }
                if(j==colum){
                    fila2[i]=matriz[i][j];
                    
                }
                
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                if(i==fila){
                    System.out.print(fila2[j] + " ");
                    
                    
                }else if(j==colum) {
                    System.out.print(fila1[i] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
                
                
                
            }System.out.println("");
        }
        
       
    }
}
        