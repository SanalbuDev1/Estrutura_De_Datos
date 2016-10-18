package nodo_al;

public class nodo1 {
   nodo1() {
       
   }
   nodo1(int info){
       this.dato=info;
       this.siguiente=null;
       
   }
   nodo1(nodo1 cab){
       dato=cab.dato;
       siguiente=cab.siguiente;
   }
    int dato;
    nodo1 siguiente;

    
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
    
    public nodo1 getSiguientenodo(){
        return siguiente;
    }
    
    public void setSiguientenodo(nodo1 siguiente){
        this.siguiente=siguiente;
    }
    
    
}