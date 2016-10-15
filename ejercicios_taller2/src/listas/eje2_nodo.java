
package listas;


public class eje2_nodo {
    
    private int dato;
    private eje2_nodo siguiente;

    
    public eje2_nodo(int info){
        this.dato=info;
        this.siguiente=null;
    }
    
    public eje2_nodo(){
        
    }
    
    public int getDato() {
        return dato;
    }

    public eje2_nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(eje2_nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
            
    
            
            
    
}
