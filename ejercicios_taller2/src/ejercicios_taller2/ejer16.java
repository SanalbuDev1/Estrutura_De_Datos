/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;

/**
 *
 * @author Santy
 */
public class ejer16 {
    public static void main(String[] args) {
        
        int matriz[][]=new int[3][3];
        int vector1[]=new int[3],suma=0;
        int vector2[]=new int[3],suma2=0;
        int vector3[]=new int[3],suma3=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+  " ");
                
                if(i==0){
                    vector1[j]=matriz[i][j];
                    suma+=vector1[j];
                }else if(i==1){
                    vector2[j]=matriz[i][j];
                    suma2+=vector2[j];
                }else{
                    vector3[j]=matriz[i][j];
                    suma3+=vector3[j];
                }
                
            }System.out.println("");
        }
        System.out.println("suma fila 1: "+ suma);
        System.out.println("suma fila 2: "+ suma2);
        System.out.println("suma fila 3: "+ suma3);
        
    }
}
