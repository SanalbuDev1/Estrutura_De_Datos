package ejercicios_taller2;

public class ejer6 {

    static int matriz[][] = new int[3][3];
    static int suma=0;
    static int resta=0;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = (int) (Math.random() * 10);
                } else {
                    matriz[i][j] = (int) (Math.random() * -10);
                }
                System.out.print(matriz[i][j] + " ");
                
                if(matriz[i][j]>0){
                    suma+=matriz[i][j];
                    
                }else{
                    resta+=matriz[i][j];
                }
            }System.out.println("");
            
        }System.out.println("la suma de los positivos es " + suma + "\n" + "la suma de los negativos es " +resta);
    }
}
