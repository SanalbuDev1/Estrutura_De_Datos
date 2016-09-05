/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author UNIREMINGTON34
 */
public class ejer2 {
    
    public void vector(){
        
        int vector[]= new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("escriba el valor del vector " + i));
            
        }
        for (int i = 9; i > -1; i--) {
            JOptionPane.showMessageDialog(null,"valor vector "+ vector[i]);
        }
        
    }public static void main(String[] args) {
        
        ejer2 ca = new ejer2();
        ca.vector();
        
    }
}
