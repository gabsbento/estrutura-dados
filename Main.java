import dados.Lista;
import dados.Vetor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Lista<String> lista = new Lista<>(5);
        System.out.println(lista.contem("A"));
    }
}
