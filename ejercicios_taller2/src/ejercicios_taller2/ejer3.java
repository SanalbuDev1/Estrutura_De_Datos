
package ejercicios_taller2;

import javax.swing.JOptionPane;


public class ejer3 {
    
    public void vector1(){
        int vector[]= new int[10];
        int vector1[]= new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("escriba el valor del vector " + i));
           
            
        }
         for (int j = 0; j < 10; j++) {
                vector1[j]=Integer.parseInt(JOptionPane.showInputDialog("escriba el valor del vector " + j));
        }
                
         for (int x=0; x<vector.length;x++) {
            if (vector[x]==vector1[x]){
                
                JOptionPane.showMessageDialog(null,"el vector1=vector en la posicion " + x);
                
            }
             
        }
    }
    
    public static void main(String[] args) {
        
            
        ejer3 ca1=new ejer3();
        ca1.vector1();
        
    }
    
}
