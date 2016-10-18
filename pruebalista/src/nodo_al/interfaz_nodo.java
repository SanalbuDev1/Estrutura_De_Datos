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
public class interfaz_nodo {
    public static void main(String[] args) {
        
       /*nodo1 primero = new nodo1(4);
       nodo1 seg = new nodo1(5);
       nodo1 ter = new nodo1(6);
              primero.setSiguientenodo(seg);
       seg.setSiguientenodo(ter);
                          System.out.println(primero.getDato());
        System.out.println(primero.getSiguientenodo().getDato());
        System.out.println(primero.getSiguientenodo().getSiguientenodo().getDato());*/
    
        }
       nodo1 cab;
       public nodo1 getCab(){
           return cab;
       }
       public void setCab(nodo1 cab){
           this.cab = cab;
       }
           interfaz_nodo(){
           this.cab=null;
       }
           interfaz_nodo(nodo1 cabeza){
               this.cab=new nodo1(cabeza);
           }
           interfaz_nodo(int dato){
               nodo1 nuevoNodo=new nodo1();
               this.cab=nuevoNodo;
           }
            public boolean esVacia(){
           return this.cab==null;
            }
        String Principio(int nuevaInfo){
            String mensaje=null;
            nodo1 nuevoNodo=new nodo1();
            nuevoNodo.setDato(nuevaInfo);
            if(esVacia()){
                this.cab=nuevoNodo;
            }else{
                nuevoNodo.setSiguientenodo(this.cab);
                this.cab=nuevoNodo;
                mensaje="se adiciono correctamente";
            }
            return mensaje;
        }
        
        String mostrar(){
            String Mensaje="";
            if(this.cab!=null){
                nodo1 temporal=this.cab;
                
                while(temporal.getSiguientenodo()!=null){
                    Mensaje=Mensaje+temporal.getDato()+ "-";
                    temporal=temporal.getSiguientenodo();
                }
            }else{
                  Mensaje="no hay datos";  
            }
            return Mensaje;
                
            
        }
        String principio1(int NuevaInfo){
            String mensaje=null;
            if(this.cab==null){
                nodo1 nuevoNodo= new nodo1(NuevaInfo);
                this.cab=nuevoNodo;
            }else{
                nodo1 nuevoNodo=new nodo1(NuevaInfo);
                nodo1 temporal=new nodo1();
                temporal=this.cab;
                while(temporal.getSiguientenodo()!=null){
                    temporal=temporal.getSiguientenodo();
                }
                    temporal.setSiguientenodo(nuevoNodo);
                    mensaje="se adiciono correctamente";
            }
            return mensaje;
        }
        
        
    }

