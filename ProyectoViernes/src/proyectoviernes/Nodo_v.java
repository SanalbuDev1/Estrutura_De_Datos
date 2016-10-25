/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoviernes;

/**
 *
 * @author Santy
 */
public class Nodo_v {

    private Nodo_v siguiente;
    private Nodo_v anterior;
    private String dato;
    
    public Nodo_v(String dat,Nodo_v ant,Nodo_v sig){
        this.siguiente=sig;
        this.anterior=ant;
        this.dato=dat;
    }

    public void setSiguiente(Nodo_v siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo_v anterior) {
        this.anterior = anterior;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo_v getSiguiente() {
        return siguiente;
    }

    public Nodo_v getAnterior() {
        return anterior;
    }

    public String getDato() {
        return dato;
    }
    public Nodo_v(){}
    
    
    
}
