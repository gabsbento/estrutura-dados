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
        System.out.println("Contem: "+lista.contem("A"));
        System.out.println("Ultimo indice: "+lista.ultimoIndice("A"));
        System.out.println("Obtem: "+ lista.obtem(2));
        System.out.println("Lista: "+lista);
        lista.limpar();
        System.out.println("Lista limpa: "+lista);
    }
}
