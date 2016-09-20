
package ejercicios_taller2;


public class ejer12 {
    
    public static void main(String[] args) {
        int matrizm[][]={{2,7,6},{9,5,1},{4,3,8}};
        int fila1=0,fila2=0,fila3=0;
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizm[i][j] + " ");
                
                
            }System.out.println("");
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0){
                  fila1+=matrizm[i][j];
                }
                if(j==1){
                  fila2+=matrizm[i][j];
                    
                }
                if(i==j){
                  fila3+=matrizm[i][j];
                }
                
                if(fila1==fila2 && fila2==fila3){
                    System.out.println("es una matriz magica");
                }
                
            }
        }
    }
    
}
