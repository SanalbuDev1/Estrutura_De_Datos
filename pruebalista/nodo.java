
package pruebalista;
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
