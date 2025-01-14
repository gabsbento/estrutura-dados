import dados.Vetor;

public class Main {
    public static void main(String[] args){
        Vetor vetor = new Vetor(4);

        vetor.adiciona("10");
        vetor.adiciona("11");
        vetor.adiciona("12");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        vetor.adiciona("13");
        vetor.adiciona("14");
        vetor.adiciona("15");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
