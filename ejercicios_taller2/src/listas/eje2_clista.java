/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author UNIREMINGTON
 */
public class eje2_clista {
    private eje2_nodo cab;
    
    public eje2_clista(){
        this.cab=null;
    }
    
    public String registrarfinal(int nuevainfo){
        String mensaje="";
        if(this.cab==null){
            eje2_nodo nuevonodo=new eje2_nodo(nuevainfo);
            this.cab=nuevonodo;
            
        }else{
            eje2_nodo nuevonodo=new eje2_nodo(nuevainfo);
            eje2_nodo temporal=new eje2_nodo();
            temporal=this.cab;
            
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
                temporal.setSiguiente(nuevonodo);
                mensaje="se registro";
            }
        }
                
         return mensaje;       
    }
    public String mostrar(){
        String mensaje="";
        if(this.cab!=null){
            eje2_nodo temporal=this.cab;
            while(temporal.getSiguiente()!=null){
                mensaje=mensaje+temporal.getDato() + "-" ;
                temporal=temporal.getSiguiente();
            }
            mensaje=mensaje+temporal.getDato() + "-" ;
                    
        }else{
            mensaje="no hay dato";
        }
        return mensaje;
    }
            
            
    
    public eje2_nodo getCab(){
        return cab;
    }
    
    public void setCab(eje2_nodo cab){
        this.cab=cab;
    }
}
