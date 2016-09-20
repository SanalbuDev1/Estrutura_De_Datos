/***
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios_taller2;

/**
 *
 * @author Santy
 */
public class ejer14 {
    public static void main(String[] args) {
        
        int dia0=0,dia1=0,dia2=0,dia3=0,dia4=0,dia5=0,dia6=0;
        int mayor=0,posicion=0;
        
        int matriz[][]=new int[7][3];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+ " ");
                
                if(i==0){
                     dia0=dia0+matriz[i][j];
                }
                if(i==1){
                     dia1=dia1+matriz[i][j];
                }
                if(i==2){
                     dia2=dia3+matriz[i][j];
                }
                if(i==3){
                     dia3=dia3+matriz[i][j];
                }
                if(i==4){
                     dia4=dia4+matriz[i][j];
                }
                if(i==5){
                     dia5=dia5+matriz[i][j];
                }
                if(i==6){
                     dia5=dia5+matriz[i][j];
                }
                
                
                
            }System.out.println("");
            
        }int dias[]={dia0,dia1,dia2,dia3,dia4,dia5,dia6};
            for (int j = 0; j < 7; j++) {
                
                if(dias[j]>mayor){
                    mayor=dias[j];
                    posicion=j;
                    
                }
                
            }
            System.out.println("el dia en que se hizo mas leche fue " + (posicion+1) +" mayor" );
    }
}
