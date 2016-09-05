/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;

public class ejer5 {

    static int matriz[][] = new int[4][2];
    

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        int x = 0;
        System.out.println("");
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                x++;
                if (x % 2 != 0) {
                  System.out.print(matriz[i][j] + " ");
                    
                }
             }
        }
        System.out.println("");
        
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                x++;
                if (x % 2 == 0) {
                  System.out.print(matriz[i][j] + " ");
                    
                }
             }
        }
    }
}
