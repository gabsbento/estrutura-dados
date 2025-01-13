import dados.Vetor;

public class Main {
    public static void main(String[] args){
        Vetor vetor = new Vetor(5);

        vetor.adiciona("10");
        vetor.adiciona("11");
        vetor.adiciona("12");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca("11"));
    }
}
