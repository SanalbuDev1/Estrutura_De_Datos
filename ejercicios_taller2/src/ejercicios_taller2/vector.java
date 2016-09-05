package ejercicios_taller2;

import java.util.Scanner;

/**
 *
 * @author UNIREMINGTON
 */
class ejer4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.print("escriba el numero de la fila que quiere ver el maximo");
        int maximo = entrada.nextInt();
        maximo--;
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = maximo; j <= maximo; j++) {
              
              
              if(matriz[i][maximo]>cont){
                  cont=matriz[i][maximo];
                  System.out.println("");
              }
            }
            
        }
        System.out.println(" ");
        System.out.println("el maximo es " + cont);

    }

}
