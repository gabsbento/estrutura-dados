package dados;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean contem(T elemento){
        return busca(elemento) > -1;
    }

    public int ultimoIndice(T elemento){
        int ultimaPos = -1;
        for(int i= this.tamanho-1; i>=0; i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return ultimaPos;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];

            // substituir por System.arraycopy
            for(int i =0;i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            //---
            this.elementos = elementosNovos;
        }
    }

    public boolean adiciona(int posicao, T elemento){
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

    public T busca(int posicao){
        if(!(posicao<this.tamanho && posicao >= 0))
            throw  new IllegalArgumentException("Posição inválida");
        return this.elementos[posicao];
    }

    public T obtem(int posicao){
        return this.busca(posicao);
    }

    public int busca(T elemento){
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void remove(T elemento){
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

    public void limpar(){
        for(int i=0; i<this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
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
