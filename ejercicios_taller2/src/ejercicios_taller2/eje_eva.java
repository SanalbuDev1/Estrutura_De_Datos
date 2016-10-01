/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;




import java.util.Scanner;
import javax.swing.JOptionPane;

class ejercicio_evaluable {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("escriba el numero de filas que quiere");
        int fila=entrada.nextInt();
        System.out.println("escriba las columnas que quiera");
        int colum=entrada.nextInt();
        
        int fila11=fila;
        fila11--;
        int colum1=colum;
        colum1--;
        
        int matriz[][]=new int[fila][colum];
        
        
      
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
                
                
                
            }System.out.println("");
        }
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                if(i==0){
                    matriz[i][j]=0;
                    
                }else if(j==0){
                    matriz[i][j]=0;
                }else if(j==colum1){
                    matriz[i][j]=0;
                }else if(i==fila11){
                    matriz[i][j]=0;
                            
                }
            }
        }
        System.out.println("");
        int suma=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matriz[i][j] + " ");
                suma+=matriz[i][j];
            }System.out.println("");
        }
                JOptionPane.showMessageDialog(null, "la suma dio " +suma);
    }
    
}
