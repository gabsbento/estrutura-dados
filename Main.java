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

        System.out.println("Tamanho do vetor: "+vetor.tamanho());
        System.out.println("Vetor: "+vetor.toString());

        vetor.remove("15");
        //vetor.adiciona("23");
        System.out.println("Vetor sem o valor 15: "+vetor);

        vetor.remove(0);
        System.out.println("Vetor sem a posicao 0: "+vetor);

        System.out.println("--------------------------------------");

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "1234-4568", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "1234-4569", "contato3@email.com");

        Vetor objetos = new Vetor(3);
        objetos.adiciona(c1);
        objetos.adiciona(c2);
        objetos.adiciona(c3);

        System.out.println("Tamanho Objeto: "+objetos.tamanho());
        System.out.println(objetos);
    }
}
