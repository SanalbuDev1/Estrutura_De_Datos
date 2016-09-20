package ejercicios_taller2;
import java.util.Scanner;

//13. El dueño de un restaurante entrevista a cinco clientes de su negocio y les pide que califiquen de 1 a 10 los siguientes aspectos: (1 es pésimo y 10 es excelente o inmejorable) 
//•	Atención de parte de los empleados 
//•	Calidad de la comida 
/*•	Justicia del precio (el precio que pagó le parece justo?) 
•	Ambiente (muebles cómodos?, música adecuada?, iluminación suficiente?, decoración, etc.) 
Escribir un programa que pida las calificaciones de los cinco clientes a cada uno de estos aspectos, y luego escriba el promedio 
obtenido en cada uno de ellos. La lista debe aparecer ordenada del aspecto mejor calificado al peor calificado. */
public class ejer13 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int atencion[] = new int[5];
        int calidad[] = new int[5];
        int precio[] = new int[5];
        int ambiente[] = new int[5];

        int Patencion = 0, Pcalidad = 0, Pprecio = 0, Pambiente = 0 ;

        for (int i = 0; i < 5; i++) {

            System.out.println("cliente numero " + i);

            System.out.println("califique la atencion (1 a 10)");
            atencion[i] = entrada.nextInt();
            System.out.println("califique la calidad (1 a 10)");
            calidad[i] = entrada.nextInt();
            System.out.println("califique la precio (1 a 10)");
            precio[i] = entrada.nextInt();
            System.out.println("califique la ambiente (1 a 10)");
            ambiente[i] = entrada.nextInt();

            Patencion += atencion[i];
            Pcalidad += calidad[i];
            Pprecio += precio[i];
            Pambiente += ambiente[i];

            if (i == 4) {

                Patencion = Patencion / 5;
                System.out.println("Atencion Promedio " + Patencion);
                Pcalidad = Pcalidad / 5;
                System.out.println("Calidad Promedio " + Pcalidad);
                Pprecio = Pprecio / 5;
                System.out.println("Precio Promedio " + Pprecio);
                Pambiente = Pambiente / 5;
                System.out.println("Ambiente Promedio " + Pambiente);
                
                
                
                

            }

        }
        System.out.println("");
        int promedios[]={Patencion,Pcalidad,Pprecio,Pambiente};
        int posicion1=0;
        int mayor=0,smayor1=0,smayor2=0,smayor3=0,menor=0;
        String nombre1=null,nombre2=null,nombre3=null,nombre4=null;
        for (int i = 0; i < 4; i++) {
            
            if(promedios[i]>mayor){
                mayor=promedios[i];
                posicion1=i;
                if(mayor==Patencion){
                    nombre1="Patencion";
                }else if(mayor==Pcalidad){
                    nombre1="Pcalidad";
                }else if(mayor==Pprecio){
                    nombre1="Pprecio";
                }else{
                    nombre1="Pambiente";
                }
            }else if (promedios[i]>smayor1 && promedios[i]!=mayor){
                smayor1=promedios[i];
                if(smayor1==Patencion){
                    nombre2="Patencion";
                }else if(smayor1==Pcalidad){
                    nombre2="Pcalidad";
                }else if(smayor1==Pprecio){
                    nombre2="Pprecio";
                }else{
                    nombre2="Pambiente";
                }
            }else if(promedios[i]>smayor2 && promedios[i]!=mayor && promedios[i]!=smayor1 ){
                smayor2=promedios[i];
                if(smayor2==Patencion){
                    nombre3="Patencion";
                }else if(smayor2==Pcalidad){
                    nombre3="Pcalidad";
                }else if(smayor2==Pprecio){
                    nombre3="Pprecio";
                }else{
                    nombre3="Pambiente";
                }
            
                
               
            }
            if(promedios[i]>menor && promedios[i]!=mayor && promedios[i]!=smayor1 && promedios[i]!=smayor2 ){
                menor=promedios[i];
                if(menor==Patencion){
                    nombre4="Patencion";
                }else if(menor==Pcalidad){
                    nombre4="Pcalidad";
                }else if(menor==Pprecio){
                    nombre4="Pprecio";
                }else{
                    nombre4="Pambiente";
                }
            }
            
        }
        System.out.println("el mayor es " + nombre1 +" "+   mayor + "\n" 
                + "el que le sigue es " + nombre2 + " " + smayor1 + "\n" +
                "el que sigue es " + nombre3 + " " + smayor2 + "\n" +
                "el que sigue es " + nombre4 + " " + menor);

    }
}
