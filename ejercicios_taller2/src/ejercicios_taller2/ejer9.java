package ejercicios_taller2;

public class ejer9 {

    public static void main(String[] args) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        String frase = "hola que mas";
        int frase1 = frase.length();
        System.out.println(frase.substring(0, frase1));
        for (int i1 = 0; i1 < frase.length(); i1++) {
            char comparar = frase.charAt(i1);
            
            if (comparar == 'a') {
                a++;
            }
            if (comparar == 'e') {
                e++;
            }
            if (comparar == 'i') {
                i++;
            }
            if (comparar == 'o') {
                o++;
            }
            if (comparar == 'u') {
                u++;
            }

        }System.out.println("a: " + a  + " e: " + e + " i: " + i + " o: " + o + " u: " + u);

    }
}
