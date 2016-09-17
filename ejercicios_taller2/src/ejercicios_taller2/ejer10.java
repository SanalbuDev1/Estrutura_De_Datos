/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_taller2;

/**
 *
 * @author UNIREMINGTON
 */
public class ejer10 {
    public static void main(String[] args) {

        int a = 0, e = 0, i = 0, o = 0, u = 0,x=0;
        String frase = "hola que mas";
        int frase1 = frase.length();
        System.out.println(frase.substring(0, frase1));
        for (int i1 = 0; i1 < frase.length(); i1++) {
            char comparar = frase.charAt(i1);
            
            if (comparar == 'a') {
                a++;
            }else if
             (comparar == 'e') {
                e++;
            }else if
             (comparar == 'i') {
                i++;
            }
            else if (comparar == 'o') {
                o++;
            }
            else if (comparar == 'u') {
                u++;
            }else{
                x=x+1;
            }

        }System.out.println("a: " + a  + " e: " + e + " i: " + i + " o: " + o + " u: " + u);
        System.out.println("consonantes " + x);

    }
}


