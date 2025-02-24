import dados.Lista;
import dados.Vetor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        lista.adiciona("C");
        System.out.println(lista.contem("A"));
        System.out.println(lista.ultimoIndice("A"));
        System.out.println(lista.obtem(2));
    }
}
