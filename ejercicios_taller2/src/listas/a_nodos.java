/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Santy
 */
public class a_nodos {

    private int dato;
    private a_nodos siguiente;
    
    public a_nodos(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
    public int obtenerValor(){
    return dato;
    }
    
    public void enlazarSiguiente(a_nodos n){
        siguiente=n;
    }
    
    public a_nodos obtenerSiguiente(){
        return siguiente;
    }
}
    