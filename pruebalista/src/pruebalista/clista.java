/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalista;

/**
 *
 * @author juandavid
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
                 temporal=temporal.getSiguiente();
             }
             temporal.setSiguiente(nuevoNodo);
             mensaje="Se adiciono correctamente";
         }
             return mensaje;
         }
    
    
    public  String mostrar(){
    
        String  Mensaje="";
        
        if(this.cab!=null){
            
            nodo temporal=this.cab;
           
         
            while(temporal.getSiguiente()!=null){
            
                Mensaje=Mensaje+temporal.getDato()+"-";
                temporal=temporal.getSiguiente();
        
            }
                Mensaje=Mensaje+temporal.getDato()+"-";
 
        }else{
        Mensaje="No hay datos";
        }
    
        return Mensaje;
    
    }
    
  
    
}
