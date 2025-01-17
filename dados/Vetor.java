package dados;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){
        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length*2];

            // substituir por System.arraycopy
            for(int i =0;i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            //---
            this.elementos = elementosNovos;
        }
    }

    public boolean adiciona(int posicao, String elemento){
        if(!(posicao<this.tamanho && posicao >= 0))
            throw new IllegalArgumentException("Posição inválida");

        this.aumentaCapacidade();

        for(int i = this.tamanho-1;i >= posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public String busca(int posicao){
        if(!(posicao<this.tamanho && posicao >= 0))
            throw  new IllegalArgumentException("Posição inválida");
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(String elemento){
        int posicao = busca(elemento);
        remove(posicao);
    }

    public void remove(int posicao){
        if(!(posicao<this.tamanho && posicao >= 0))
            throw  new IllegalArgumentException("Posição inválida");
        for(int i=posicao; i<tamanho();i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}
