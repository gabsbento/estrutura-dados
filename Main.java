import dados.Lista;
import dados.Vetor;

public class Main {
    public static void main(String[] args){
        Lista<String> vetor = new Lista<>(2);
        vetor.adiciona("Teste");
        vetor.adiciona("1");
        System.out.println(vetor);

    }
}
