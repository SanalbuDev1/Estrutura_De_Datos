
package ejercicios_taller2;

import java.util.Scanner;


public class ejer11 {
    
    public static void main(String[] args) {
        
        System.out.println("escriba una frase");
        Scanner entrada=new Scanner(System.in);
        String frase=entrada.nextLine();
         
        char []frase1=new char [frase.length()];
        
        for (int i = 0; i < frase.length(); i++) {
            frase1[i]=frase.charAt(i);
                       
        }
        for (int i = 0; i < frase1.length; i++) {
            if(frase1[i]=='a' || frase1[i]=='e' || frase1[i]=='i' || frase1[i]=='o' || frase1[i]=='u' ){
                frase1[i]='.';
            }
           
            System.out.print(frase1[i]  ); 
            
        }
    }
}
