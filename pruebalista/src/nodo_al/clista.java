/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo_al;

/**
 *
 * @author Santy
 */
public class clista {
    nodo cab;
    public nodo getCab() {
        return cab;
    }
    public void setCab(nodo cab) {
        this.cab = cab;
    }
       clista(){
    this.cab=null;
    }
       clista(nodo cabeza){
    this.cab=new nodo(cabeza);
    }
       clista(int dato){
    nodo nuevonodo=new nodo(dato);
    this.cab=nuevonodo;
    }
       String insertarprincipio(int nuevoInfo){
         String mensaje=null;
         if(this.cab==null)
         {
             nodo nuevoNodo= new nodo(nuevoInfo);
             this.cab=nuevoNodo;
             mensaje="ya hay cabezera";
         }
         else
         {
             nodo nuevoNodo=new nodo(nuevoInfo);
             nodo temporal= new nodo();
             temporal=this.cab;
             while( temporal.getSiguiente()!=null ){
                 temporal=temporal.getSiguiente();}
             temporal.setSiguiente(nuevoNodo);
             mensaje="Se adiciono correctamente";
         }
             return mensaje;
         }
    
    
    public  String mostrar(){
    
       String mensaje="";
       if(this.cab!=null){
           nodo temporal=this.cab;
           if(temporal.getSiguiente()!=null){
               this.cab=temporal;
               mensaje=mensaje+this.cab.getDato();
               temporal=temporal.getSiguiente();
           }
           mensaje=mensaje+temporal.getDato()+"_";
           
       }
       return mensaje;
    }
    
  
    
}
