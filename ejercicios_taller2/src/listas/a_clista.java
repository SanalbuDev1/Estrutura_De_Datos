
package listas;


public class a_clista {
    public static void main(String[] args) {
        a_nodos pri = new a_nodos(3);
        a_nodos seg = new a_nodos(4);
        a_nodos ter = new a_nodos(5);
        
        pri.enlazarSiguiente(seg);
        pri.obtenerSiguiente().enlazarSiguiente(ter);
        
        
        
        System.out.println(pri
                .obtenerSiguiente()//segundo nodo
                .obtenerSiguiente()//tercer nodo
                .obtenerValor());
    }
}
