/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_al;


public class nodo {
    int dato;
    nodo siguiente;
   
    public int getDato() {
        return dato;
    
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    nodo(){}
      nodo(int info){
       this.dato=info;
       this.siguiente=null;
   }
     nodo(nodo cab){
    dato=cab.dato;
    siguiente=cab.siguiente;
    }
    
    
}