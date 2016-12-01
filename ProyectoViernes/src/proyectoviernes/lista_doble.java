
package proyectoviernes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class lista_doble {
    
    
    private Nodo_v inicio;
    private Nodo_v fin;
    private Nodo_v par;
    
    
    public lista_doble(){
        inicio=null;
        fin=null;
    }
    
    public String insertarInicio(String dato){
        String mensaje="se añadio correctamente ";
        if(inicio==null){
            inicio=new Nodo_v(dato,null,null);
            fin=inicio;
        }else{
           Nodo_v nuevo = new Nodo_v(dato,null,inicio);
           inicio.setAnterior(nuevo);
           inicio=nuevo;
           mensaje=mensaje+inicio.getAnterior();
                  
        }
        return mensaje;
    }
    
    public String insertarFinal(String dato){
         String mensaje="se añadio correctamente";
        if(inicio==null){
            fin=new Nodo_v(dato,null,null);
            inicio=fin;
        }else{
           Nodo_v nuevo = new Nodo_v(dato,fin,null);
           fin.setSiguiente(nuevo);
           fin=nuevo;
           mensaje=mensaje+fin.getSiguiente();       
        }
        return mensaje;
    }
   public  String mostrar(){
    
        String  Mensaje="-";
        
        if(inicio!=null){
            
            Nodo_v temporal=inicio;
         
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
    
   /* public String Extrar_inicio(){
        String dato=inicio.getDato();
        inicio=inicio.getSiguiente();
        
        if(inicio!=null){
            inicio.setAnterior(null);
        }else{
            fin=null;
        }
        
        return dato;
        
    }
    
     public String Extrar_fin(){
        String dato=fin.getDato();
        fin=fin.getAnterior();
        
        if(fin!=null){
            fin.setSiguiente(null);
        }else{
            inicio=null;
        }
        
        return dato;
        
    }*/
     
     public String MostrarAdelante(){
         Nodo_v temporal=inicio;
         String mensaje="";
         while(temporal!=null){
             
             mensaje=mensaje+temporal.getDato() + "-";
             temporal=temporal.getSiguiente();
             
         }
         return mensaje;
     }
     
     public String mensajeAdelante(){
         String mensaje="";
         if(inicio!=null){
             mensaje="se mostro correctamente hacia adelante";
         }else{
             mensaje="no hay datos";
         }
         return mensaje;
     }
     
      public String MostrarAlrevez(){
         Nodo_v temporal=fin;
         String mensaje="";
         while(temporal!=null){
             
             mensaje=mensaje+temporal.getDato() + "-";
             temporal=temporal.getAnterior();
         }
         return mensaje;
     }
      public String mensajeHaciaAtras(){
         String mensaje="";
         if(fin!=null){
             mensaje="se mostro correctamente alrevez";
         }else{
             mensaje="no hay datos";
         }
         return mensaje;
     }
      
      public String pares(String dato){
          String x=dato;
          int x2=Integer.parseInt(x),contador=0;
          String mensaje="";
          Nodo_v temporal=inicio;
          
          if(x2%2==0){
         
                  
                  mensaje="es par ";
                
              
          }else{
              mensaje="no es par";
          }
          
          
          
          return mensaje;
      }
       public String impares(String dato1){
          String x=dato1;
          int x2=Integer.parseInt(x),contador=0;
          String mensaje="";
          Nodo_v temporal=inicio;
          
          if(x2%2!=0){
         
                  
                  mensaje="es impar ";
                
              
          }else{
              mensaje="no es impar";
          }
          
          
          
          return mensaje;
      }
       
       public String promedio(){
           String mensaje="";
           int x=0;
           x=0;
           String contador2;
           int contador=0;
           while(x!=100){
               
               contador2=JOptionPane.showInputDialog("escriba numero");
               contador=Integer.parseInt(contador2);
               x=x+contador;
               
           }
           
           return mensaje;
       }
            
    
}


