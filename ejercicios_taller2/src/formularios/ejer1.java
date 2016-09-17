/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author UNIREMINGTON
 */
public class ejer1 {
        
        String Color;
        int cilandraje;
        String Marca;
        int Modelo;
                      
        public boolean prender(){
            return true;            
        }
        
        public String construir(int cilind , String col, int model , String marc){
            
            this.cilandraje=cilind;
            this.Color=col;
            this.Modelo=model;
            this.Marca=marc;
            String Mensaje="el cilindraje es" + cilandraje + "\n" + "la marca es " + Marca
                    + "\n" + " el modelo es " + Modelo + "\n" +"la marca es " + Marca;
            return Mensaje;
            
            
            
        }
    

}
