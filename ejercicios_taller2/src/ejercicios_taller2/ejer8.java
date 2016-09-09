//Escribir un programa que lea una matriz de 4 filas y 3 columnas, la visualice por pantalla y a 
//continuación encuentre el mayor y el menor elemento de la matriz y sus posiciones.
package ejercicios_taller2;

/**
 *
 * @author Santy
 */
public class ejer8 {
    public static void main(String[] args) {
        
        int matriz[][]=new int[4][4],mayor=0,fila=0,columna = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int) (Math.random()*10);
                System.out.print(matriz[i][j] + " ");
                
                if(mayor<matriz[i][j]){
                    mayor=matriz[i][j];
                     fila=i;
                     columna=j;
                }
                
            }System.out.println("");
        } System.out.println("el numero mas grande es "+ matriz[fila][columna]+ " esta en la posicion " + fila + " "+ columna);
        
    }
}
