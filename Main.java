import dados.Lista;
import dados.Vetor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("C"));
    }
}
