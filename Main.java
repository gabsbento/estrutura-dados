import dados.Vetor;

public class Main {
    public static void main(String[] args){
        Vetor vetor = new Vetor(4);

        vetor.adiciona("10"); // 0
        vetor.adiciona("11"); // 1
        vetor.adiciona("12"); // 2

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        vetor.adiciona("13"); // 3
        vetor.adiciona("14"); // 4
        vetor.adiciona("15"); // 5

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        vetor.remove("15");
        //vetor.adiciona("23");
        System.out.println("Vetor sem o valor 15: "+vetor);

        vetor.remove(0);
        System.out.println("Vetor sem a posicao 0: "+vetor);
    }
}
